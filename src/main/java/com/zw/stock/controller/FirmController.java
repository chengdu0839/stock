package com.zw.stock.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.zw.stock.model.Firm;
import com.zw.stock.model.HistoryDetail;
import com.zw.stock.repository.FirmRepository;
import com.zw.stock.repository.HistoryDetailRepository;
import com.zw.stock.service.FirmService;
import com.zw.stock.vo.FirmVO;

@Controller
public class FirmController {

	@Autowired  
	private FirmRepository firmRepository;
	
	@Autowired
	private FirmService firmService;
	
	@Autowired
	private HistoryDetailRepository historyDetailRepository;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView helloWorld(ModelMap model) {
		List<Firm> users = firmRepository.findAll();
		ModelAndView modelAndView = new ModelAndView("index1");
		modelAndView.addObject("users", users);
		return modelAndView;
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView saveFirm(FirmVO firmVO) {
		Firm firm = firmService.saveFirm(firmVO);
		ModelAndView modelAndView = new ModelAndView("firm");
		modelAndView.addObject("firm", firm);
		return modelAndView;
	}
	
	@RequestMapping(value = "/findFirm", method = RequestMethod.POST)
	public ModelAndView findFirm(FirmVO firmVO) {
		List<Firm> firms = firmService.findFirm(firmVO);
		ModelAndView modelAndView = new ModelAndView("firmList");
		modelAndView.addObject("firms", firms);
		return modelAndView;
	} 
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public ModelAndView test(FirmVO firmVO) {
		
		HistoryDetail detail = new HistoryDetail();
 		detail.setCode("A12311111111");
		detail.setHeightPrice(999.0f);
		HistoryDetail save2 = historyDetailRepository.save(detail);
		
		Firm firm = new Firm();
		firm.setCode("A123111");
		firm.setName("Afirm2016");
		firm.getHistoryDetails().add(detail);
		Firm save = firmRepository.save(firm);
		
		List<Firm> firms = firmService.findFirm(firmVO);
		
		List<Firm> findByName = firmRepository.findByName(firm.getName());
		ModelAndView modelAndView = new ModelAndView("firmList");
		modelAndView.addObject("firms", firms);
		return modelAndView;
	}
	
	/**
	 * 爬取上市公司
	 * @param firmVO
	 * @return
	 */
	@RequestMapping(value = "/crawlFirmByCode", method = RequestMethod.POST)
	public @ResponseBody List<Firm> crawlFirmByCode(@RequestBody FirmVO firmVO) {
		List<Firm> firmList = firmService.crawlFirmByCode(firmVO);
		return firmList;
	}
}
