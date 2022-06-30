package com.hitex.yousim.service.impl;


import com.hitex.yousim.dto.model.FeedMessage;
import com.hitex.yousim.read.RSSFeedParser;
import com.hitex.yousim.service.FeedMessageService;
import com.hitex.yousim.utils.exception.ApplicationException;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.List;

@Service
public class FeedMessageServiceImpl implements FeedMessageService {


    @Override
    public List<FeedMessage> getListFeedMessage() throws ApplicationException, ParseException {

        RSSFeedParser parser = new RSSFeedParser(
                "https://vnexpress.net/rss/thoi-su.rss");
        List<FeedMessage> feed = parser.readFeed();
        return feed;
    }
}
