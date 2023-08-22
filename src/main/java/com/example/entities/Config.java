package com.example.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="ConfigMaster")
public class Config {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="config_Id")
	private int config_Id;
	
	@Column(name="ConfigName",nullable = false)
	private String configName;

	public Config() {
		super();
	}

	public Config( String configName) {
		super();
		this.configName = configName;
	}

	public int getconfig_Id() {
		return config_Id;
	}

	public void setconfig_Id(int config_Id) {
		this.config_Id = config_Id;
	}

	public String getConfigName() {
		return configName;
	}

	public void setConfigName(String configName) {
		this.configName = configName;
	}

	@Override
	public String toString() {
		return "Config [config_Id=" + config_Id + ", configName=" + configName + "]";
	}
	
	
	
}
