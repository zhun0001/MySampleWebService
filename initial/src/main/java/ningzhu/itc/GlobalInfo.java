package ningzhu.itc;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ningzhu.itc.data.ItcEntry;

public class GlobalInfo {

	private static GlobalInfo instance;

	private Map<String, List<ItcEntry>> itcEntryMap;

	private GlobalInfo() {
		itcEntryMap = new HashMap<String, List<ItcEntry>>();
		
		initData();
	}

	public static synchronized GlobalInfo getInstance() {
		if (instance == null) {
			instance = new GlobalInfo();
		}
		return instance;
	}

	public List<ItcEntry> getItcEntryList(String userName) {
		return itcEntryMap.get(userName);
	}

	public void setItcEntryList(String userName, List<ItcEntry> itcEntryList) {
		itcEntryMap.put(userName, itcEntryList);
	}
	
	public void initData() {
		List<ItcEntry> itcEntryList = new ArrayList<ItcEntry>();
		
		Calendar cal = Calendar.getInstance();
		cal.set(2018, Calendar.MAY, 7, 9, 0, 0);
		Date startTime = cal.getTime();
		cal.set(2018, Calendar.MAY, 7, 12, 0, 0);
		Date endTime = cal.getTime();
		ItcEntry entry1 = new ItcEntry(startTime, endTime, "NEVISACCESSAPP-220", "SOME ITC TAG NAME", "some comments", "ningzhu");
		
		cal = Calendar.getInstance();
		cal.set(2018, Calendar.MAY, 7, 13, 0, 0);
		startTime = cal.getTime();
		cal.set(2018, Calendar.MAY, 7, 18, 0, 0);
		endTime = cal.getTime();
		ItcEntry entry2 = new ItcEntry(startTime, endTime, "NEVISACCESSAPP-220", "SOME ITC TAG NAME", "some comments", "ningzhu");
		
		cal = Calendar.getInstance();
		cal.set(2018, Calendar.MAY, 8, 9, 30, 0);
		startTime = cal.getTime();
		cal.set(2018, Calendar.MAY, 8, 12, 0, 0);
		endTime = cal.getTime();
		ItcEntry entry3 = new ItcEntry(startTime, endTime, "NEVISACCESSAPP-220", "SOME ITC TAG NAME", "some comments", "ningzhu");
		
		itcEntryList.add(entry1);
		itcEntryList.add(entry2);
		itcEntryList.add(entry3);
		
		itcEntryMap.put("ningzhu", itcEntryList);
	}
}
