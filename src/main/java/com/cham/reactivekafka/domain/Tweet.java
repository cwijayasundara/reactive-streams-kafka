package com.cham.reactivekafka.domain;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Tweet {
    private String id;
    private String userName;
    private String tweetText;
}
