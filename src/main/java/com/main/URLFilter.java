package com.main;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

import org.apache.log4j.Logger;

/**
 * This Class is responsible to format URL . We have to extract 2014 mail only
 * 
 * @author Manish Kumar
 * @version 1.0
 * @since 10-April-2015
 */

public class URLFilter {

	private static final Logger logger = Logger.getLogger(URLFilter.class);

	public Set<String> getMonth(Set<String> urls) {

		// Iterator urlsIter
		Iterator<String> urlsIter = urls.iterator();
		String filterUrl;
		// Queue<String> links = new ConcurrentLinkedQueue<String>();
		Set<String> links = new LinkedHashSet<String>();
		while (urlsIter.hasNext()) {
			filterUrl = urlsIter.next();

			// System.out.println(st+" URL  "+st.matches(".*?2014.*?"));
			if (filterUrl.matches(".*?2014.*?"))
				links.add(filterUrl);
		}

		logger.info("Size of the queue is " + links.size());
		return links;
	}

}
