package com.ecodation.io;

import java.io.File;

public class IODers {

	public static void main(String[] args) {

		String path = "C:\\fileIO\\5grup.txt";
		File file = new File(path);

		// can
		System.out.println("çalışabiliyor mu ? " + file.canExecute());
		System.out.println("okunabilir mi ? " + file.canRead());
		System.out.println("yazılabilinir mi ? " + file.canWrite());

		System.out.println("------------");
		// get
		System.out.println(file.getFreeSpace());
		System.out.println(file.getTotalSpace());
		System.out.println(file.getParentFile());
		System.out.println(file.getName());
		System.out.println(file.getPath());
		System.out.println(file.getAbsolutePath()); //
		System.out.println(file.getClass());

		System.out.println("++++++++++++++++++");

		// is
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());
		System.out.println(file.isHidden());
		System.out.println(file.isAbsolute());

		// System.out.println(file.delete());
		System.out.println(file.length());

	}

}
