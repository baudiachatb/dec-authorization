package b.com.demo.dec.authorizationserver.config;

import com.nimbusds.jose.jwk.JWKSet;
import com.nimbusds.jose.jwk.RSAKey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.provider.endpoint.FrameworkEndpoint;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.security.KeyPair;
import java.security.PublicKey;
import java.security.interfaces.RSAPublicKey;
import java.util.Map;

@FrameworkEndpoint
public class JWKEndpoint {
    @Autowired
    KeyPair keyPair;

    @GetMapping("/.well-known/jwks.json")
    @ResponseBody
    public Map<String, Object> jwkEndpoint() {
        RSAPublicKey publicKey = (RSAPublicKey) keyPair.getPublic();
        RSAKey rsaKey = new RSAKey.Builder(publicKey).build();

        return new JWKSet(rsaKey).toJSONObject();
    }
}
