package b.com.demo.dec.authorizationserver.entities;

import javax.persistence.*;

@Entity
@Table(name = "oauth_client_details")
public class OauthClientDetail {
    @Id
    @Column(name = "client_id")
    private String clientId;

    private String clientSecret;

    private String redirectUri;
    private String scope;

}
