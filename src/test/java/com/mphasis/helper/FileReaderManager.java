package com.mphasis.helper;

import java.io.IOException;

public class FileReaderManager {

	private FileReaderManager() {

	}

	public static FileReaderManager getInstance() {

		FileReaderManager frm = new FileReaderManager();
		return frm;

	}

	public static ConfigurationReader getCRInstance() throws IOException {

		ConfigurationReader crm = new ConfigurationReader();
		return crm;

	}

//	private FileReaderManager() {
//
//	}
//
//	public static FileReaderManager getInstance() {
//
//		FileReaderManager fr = new FileReaderManager();
//		return fr;
//
//	}
//	
//	public ConfigurationReader getCRInstance() throws IOException {
//		
//		ConfigurationReader cr = new ConfigurationReader();
//		return cr;
//
//	}

}
