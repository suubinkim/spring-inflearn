package hello.core.web;

import hello.core.common.MyLogger;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

@Service
@RequiredArgsConstructor
public class LogDemoService {

    private final ObjectProvider<MyLogger> myLoggerObjectProvider;

    public void logic(String testId) {
        MyLogger myLogger = myLoggerObjectProvider.getObject();
        myLogger.log("service id = " + testId);
    }
}
