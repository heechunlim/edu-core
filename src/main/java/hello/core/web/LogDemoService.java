package hello.core.web;

import hello.core.common.MyLogger;
import jakarta.inject.Provider;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

@Service
@RequiredArgsConstructor
public class LogDemoService {
    private final Provider<MyLogger> myLoggerProvider;

    public void logic(String id) {
        MyLogger myLogger = myLoggerProvider.get();
        myLogger.log("service id = " + id);
    }
}
