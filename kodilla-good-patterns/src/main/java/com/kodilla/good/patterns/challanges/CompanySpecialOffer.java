package com.kodilla.good.patterns.challanges;

import java.time.LocalDateTime;

public interface CompanySpecialOffer {
    boolean specialOffer (User user, Product product, LocalDateTime orderDate);
}
