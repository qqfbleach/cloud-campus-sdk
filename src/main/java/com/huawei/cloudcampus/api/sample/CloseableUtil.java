package com.huawei.cloudcampus.api.sample;

import java.io.Closeable;
import java.io.IOException;

public class CloseableUtil {
	public static void close(Closeable closeable) {
		if (closeable != null) {
			try {
				closeable.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
