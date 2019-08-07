package co.grandcircus.InvestorApi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import co.grandcircus.InvestorApi.service.InvestorApiService;

@Controller
public class InvestorApiController {

	@Autowired
	private InvestorApiService api; 
	
	@RequestMapping("/")
	public ModelAndView index() {
		return new ModelAndView("index");
	}
	
	@RequestMapping("/spread")
	public ModelAndView spread() {
		return new ModelAndView("spread", "securities", api.effectiveSpread());
	}
	
	@RequestMapping("/quotes")
	public ModelAndView getQuote(
			@RequestParam("symbol") String symbol) {
		return new ModelAndView("quotes", "each", api.getQuote(symbol));
	}
}
