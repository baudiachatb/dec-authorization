package b.com.demo.dec.authorizationserver.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@Table(name = "user")
@Getter
@ToString
public class User implements Serializable {

    public User() {

    }

    public User(User user) {
        this.id = user.getId();
        this.username = user.getUsername();
        this.password = user.getPassword();
        this.email = user.getEmail();
        this.enabled = user.isEnabled();
        this.accountNonExpired = user.isAccountNonExpired();
        this.credentialsNonExpired = user.isCredentialsNonExpired();
        this.accountNonLocked = user.isAccountNonLocked();
        this.roles = user.getRoles();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;
    @Column(name = "email")
    private String email;
    @Column(name = "enabled")
    private boolean enabled;
    @Column(name = "accountnonexpired")
    private boolean accountNonExpired;
    @Column(name = "credentialsnonexpired")
    private boolean credentialsNonExpired;
    @Column(name = "accountnonlocked")
    private boolean accountNonLocked;


    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "role_user", joinColumns = {@JoinColumn(name = "user_id", referencedColumnName = "id")},
            inverseJoinColumns = {
                    @JoinColumn(name = "role_id", referencedColumnName = "id")})
    private List<Role> roles;

//    protected boolean getAccountNonExpired() {
//        return accountNonExpired;
//    }
//
//    protected boolean getAccountNonLocked() {
//        return accountNonLocked;
//    }
//
//    protected boolean getCredentialsNonExpired() {
//        return credentialsNonExpired;
//    }
//
//    protected boolean getEnabled() {
//        return enabled;
//    }
}
