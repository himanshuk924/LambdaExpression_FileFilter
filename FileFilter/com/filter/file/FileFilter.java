package com.filter.file;

import java.io.File;

public class FileFilter {

	public static void main(String[] args) {
		File file = new File("MyFolder");
		// Using lambda expression
		File listOfFolder[] = file.listFiles((fileElement) -> {
			return fileElement.isDirectory();
		});
		// Iterating each file element
		for (File F : listOfFolder) {
			System.out.println(F.getName());
		}

	}

}
