package org.virtuSkill.jersey;

import java.util.Date;

public class VersionVO {

	private String versionNumber;
	private int buildNumber;
	private Date buildDate;
	private String gitSourceTag;

	public VersionVO() {

	}

	public VersionVO(String versionNumber, int buildNumber, Date buildDate, String gitSourceTag) {
		super();
		this.versionNumber = versionNumber;
		this.buildNumber = buildNumber;
		this.buildDate = buildDate;
		this.gitSourceTag = gitSourceTag;
	}

	public String getVersionNumber() {
		return versionNumber;
	}

	public void setVersionNumber(String versionNumber) {
		this.versionNumber = versionNumber;
	}

	public int getBuildNumber() {
		return buildNumber;
	}

	public void setBuildNumber(int buildNumber) {
		this.buildNumber = buildNumber;
	}

	public Date getBuildDate() {
		return buildDate;
	}

	public void setBuildDate(Date buildDate) {
		this.buildDate = buildDate;
	}

	public String getGitSourceTag() {
		return gitSourceTag;
	}

	public void setGitSourceTag(String gitSourceTag) {
		this.gitSourceTag = gitSourceTag;
	}

}
