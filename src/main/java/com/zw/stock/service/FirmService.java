package com.zw.stock.service;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.ByteArrayBuffer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.zw.stock.model.Firm;
import com.zw.stock.repository.FirmRepository;
import com.zw.stock.vo.FirmVO;

@Service
public class FirmService {

	@Autowired
	private FirmRepository firmRepository;

	public List<Firm> findFirm(FirmVO firmVO) {
		return null;
	}

	public Firm saveFirm(FirmVO firmVO) {
		return firmRepository.save(firmVO.getFirm());
	}

	public List<Firm> crawlFirmByCode(FirmVO firmVO) {
		List<Firm> firmList = new ArrayList<Firm>();
		String[] types = firmVO.getType();
		Firm firm = firmVO.getFirm();
		if (null != firm) {
			String firmCode = firm.getCode();
			if (!StringUtils.isEmpty(firmCode)) {
				firm = firmRepository.findByCode(String.valueOf(firmCode));
				if (firm != null) {
					firm.setExit(true);
				} else {
					for (String type : types) {
						String firmStr = getCompany(firmCode, type);
						if (null != firmStr) {
							String[] split = firmStr.split("\"");
							if (split.length > 2 && split[1].length() > 1) {
								firm = new Firm();
								String[] values = split[1].split(",");
								firm.setName(values[0]);
								firm.setName(firmCode);
								firm.setType(type);
								break;
							}
						}
					}
					if (null != firm) {
						firmList.add(firm);
					}
				}
			} 
		}
		else {
			int minFirmCode = firmVO.getMinFirmCode();
			int maxFirmCode = firmVO.getMaxFirmCode();
			for (String type : types) {
				for (int code = minFirmCode; code <= maxFirmCode; code++) {
					firm = firmRepository.findByCode(String.valueOf(code));
					if (firm != null) {
						firm.setExit(true);
					} else {
						String firmStr = getCompany(String.valueOf(code), type);
						if (null != firmStr) {
							String[] split = firmStr.split("\"");
							if (split.length > 1 && split[1].length() > 1) {
								firm = new Firm();
								String[] values = split[1].split(",");
								firm.setName(values[0]);
								firm.setCode(String.valueOf(code));
								firm.setType(type);
							}
						}
					}
					if (null != firm) {
						firmList.add(firm);
					}
				}
			}
		}
		return firmList;
	}

	private String getCompany(String code, String type) {
		CloseableHttpClient httpclient = HttpClients.createDefault();
		CloseableHttpResponse response = null;
		try {
			HttpGet httpGet = new HttpGet("http://hq.sinajs.cn/list=" + type + code);
			response = httpclient.execute(httpGet);
			HttpEntity entity = response.getEntity();
			InputStream inputStream = entity.getContent();
			ByteArrayBuffer buffer = new ByteArrayBuffer(4096);
			byte[] tmp = new byte[4096];
			int count;
			while ((count = inputStream.read(tmp)) != -1) {
				buffer.append(tmp, 0, count);
			}
			return new String(buffer.toByteArray(), "GBK");
		} catch (Exception e) {
		} finally {
			try {
				response.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				httpclient.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
}
