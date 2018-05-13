package hello;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ningzhu.itc.GlobalInfo;
import ningzhu.itc.data.ItcEntry;
import ningzhu.itc.data.Result;

@RestController
public class ItcServiceController {

	private GlobalInfo globalInfo = GlobalInfo.getInstance();

	@RequestMapping(value="/getItc", method=RequestMethod.GET)
	public List<ItcEntry> getItc(@RequestParam(value = "name", defaultValue = "ningzhu") String name) {

		System.out.println("input name: " + name);
		List<ItcEntry> result = globalInfo.getItcEntryList(name);
		return result;
	}
	
	@RequestMapping(value="/updateItc", method=RequestMethod.POST)
	public Result updateItc(@RequestBody ItcEntry itcEntry) {
		
		String userName = itcEntry.getUserName();
		System.out.println("userName: " + userName);
		
		List<ItcEntry> itcEntryList = globalInfo.getItcEntryList(userName);
		itcEntryList.add(itcEntry);
		
		Result result = new Result();
		result.setStatus(1200);
		result.setMessage("success");
		
		return result;
	}
}
