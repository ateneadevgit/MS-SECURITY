package com.fusm.security.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BlackListModel {

    private String word;
    private Boolean isHtml;

}
