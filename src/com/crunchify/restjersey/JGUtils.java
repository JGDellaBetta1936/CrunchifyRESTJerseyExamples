package com.crunchify.restjersey;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class JGUtils {
	static Logger log = Logger.getLogger(JGUtils.class.getName());

	public static String returnPrettyPrint(String jsonString) {
		JsonParser parser = new JsonParser();
		JsonObject json = parser.parse(jsonString).getAsJsonObject();

		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		return gson.toJson(json);
	}
	
	public static String formatThisDate() {
		final Date now = new Date();
		final DateFormat format = new SimpleDateFormat(JGConstants.getDatetimeformatpattern());
		return format.format(now);
}
}
