package io;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class StreamVSBuffer {
	public static void streamMethod() {
		try {
			long start = System.currentTimeMillis();
			DataOutputStream dos = new DataOutputStream(new FileOutputStream("test.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
