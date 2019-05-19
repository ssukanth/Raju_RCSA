package com.infotech.Excel;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;

import org.apache.commons.io.comparator.LastModifiedFileComparator;
import org.apache.commons.io.filefilter.WildcardFileFilter;

public class RenameFile {
	
	 public File getTheNewestFile(String filePath, String ext) {
	     File theNewestFile = null;
	     File dir = new File(filePath);
	     FileFilter fileFilter = new WildcardFileFilter("*." + ext);
	     File[] files = dir.listFiles(fileFilter);

	     if (files.length > 0) {
	         /** The newest file comes first **/
	         Arrays.sort(files, LastModifiedFileComparator.LASTMODIFIED_REVERSE);
	         theNewestFile = files[0];
	     }

	     return theNewestFile;
	 }
	 
	 
	 public File getTheSecondNewestFile(String filePath, String ext) {
	     File theSecondNewestFile = null;
	     File dir = new File(filePath);
	     FileFilter fileFilter = new WildcardFileFilter("*." + ext);
	     File[] files = dir.listFiles(fileFilter);

	     if (files.length > 1) {
	         /** The newest file comes first **/
	         Arrays.sort(files, LastModifiedFileComparator.LASTMODIFIED_REVERSE);
	         theSecondNewestFile = files[1];
	     }

	     return theSecondNewestFile;
	 }
}
