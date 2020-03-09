package com.demo.spring.core15;

import com.demo.spring.core15.regex.StockDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloService {
  @Autowired
  private HelloDao helloDao;

  @Autowired
  private AddressDao addressDao;

  @Autowired
  private StockDao stockDao;

  @Override
  public String toString() {
    return "HelloService{" +
        "helloDao=" + helloDao +
        '}';
  }
}
