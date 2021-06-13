package com.test.opsAll.dto;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.test.opsAll.conf.DateParser;


/*{"pfm":"DESKTOP", "level":"INFO", "step" : "SEARCH", "timestamp":"2020-11-18 13:24:11.039+0530"}
{*/
public class ParserDto implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8985173528234030933L;
	private String pfm;
	private String level;
	private String step;
	@JsonDeserialize(using = DateParser.class)
	private Date timestamp;
	
	@Override
	public String toString() {
		return "ParserDto [pfm=" + pfm + ", level=" + level + ", step=" + step + ", timestamp=" + timestamp + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((level == null) ? 0 : level.hashCode());
		result = prime * result + ((pfm == null) ? 0 : pfm.hashCode());
		result = prime * result + ((step == null) ? 0 : step.hashCode());
		result = prime * result + ((timestamp == null) ? 0 : timestamp.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ParserDto other = (ParserDto) obj;
		if (level == null) {
			if (other.level != null)
				return false;
		} else if (!level.equals(other.level))
			return false;
		if (pfm == null) {
			if (other.pfm != null)
				return false;
		} else if (!pfm.equals(other.pfm))
			return false;
		if (step == null) {
			if (other.step != null)
				return false;
		} else if (!step.equals(other.step))
			return false;
		if (timestamp == null) {
			if (other.timestamp != null)
				return false;
		} else if (!timestamp.equals(other.timestamp))
			return false;
		return true;
	}
	public String getPfm() {
		return pfm;
	}
	public void setPfm(String pfm) {
		this.pfm = pfm;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getStep() {
		return step;
	}
	public void setStep(String step) {
		this.step = step;
	}
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	
	

}
