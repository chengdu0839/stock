package com.zw.stock.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.zw.stock.model.Firm;
import com.zw.stock.model.HistoryDetail;
import com.zw.stock.repository.HistoryDetailRepository;
import com.zw.stock.service.FirmService;
import com.zw.stock.service.HistoryDetailService;
import com.zw.stock.vo.FirmVO;

//@Controller
public class HistoryDetailController {

	/*@Autowired
	public HistoryDetailRepository historyDetailRepository;
	
	@Autowired
	public HistoryDetailService historyDetailService;
	
	@Autowired
	private FirmService firmService;
	
	@RequestMapping(value = "/findDetail", method = RequestMethod.POST)
	public ModelAndView findDetail(FirmVO firmVO) {
		List<HistoryDetail> historyDetail = historyDetailService.findDetail(firmVO);
		ModelAndView modelAndView = new ModelAndView("historyDetail");
		modelAndView.addObject("historyDetail", historyDetail);
		return modelAndView;
	}
	
	@RequestMapping(value = "/findDetail", method = RequestMethod.POST)
	public ModelAndView saveDetail(FirmVO firmVO) {
		
		List<Firm> findFirm = firmService.findFirm(firmVO);
		List<HistoryDetail> historyDetail = historyDetailService.findDetail(firmVO);
		ModelAndView modelAndView = new ModelAndView("historyDetail");
		modelAndView.addObject("historyDetail", historyDetail);
		return modelAndView;
	}*/
}
