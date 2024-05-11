package com.fusm.security.entity;

import lombok.*;

import javax.persistence.*;

@Builder
@Entity
@Data
@Table(name = "Security")
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class Security {

    @Id
    @Column(name = "id_security", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer securityId;

    @NonNull
    @Column(name = "word", nullable = false)
    private String word;

    @NonNull
    @Column(name = "is_html", nullable = false)
    private Boolean isHtml;

}
