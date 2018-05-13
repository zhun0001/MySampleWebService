package ningzhu.itc.data;

import java.util.Date;

public class ItcEntry {

	private Date startTime;
	private Date endTime;
	private String jiraTicket;
	private String itcTag;
	private String comment;
	private String userName;
	
	public ItcEntry() {
		super();
	}
	
	public ItcEntry(Date startTime, Date endTime, String jiraTicket, String itcTag, String comment, String userName) {
		this.startTime = startTime;
		this.endTime = endTime;
		this.jiraTicket = jiraTicket;
		this.itcTag = itcTag;
		this.comment = comment;
		this.userName = userName;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getJiraTicket() {
		return jiraTicket;
	}

	public void setJiraTicket(String jiraTicket) {
		this.jiraTicket = jiraTicket;
	}

	public String getItcTag() {
		return itcTag;
	}

	public void setItcTag(String itcTag) {
		this.itcTag = itcTag;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}
