package com.ryan.oauth2.org.security.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "users_authorities")
public class UsersAuthorities implements Serializable {

  private static final long serialVersionUID = -5180455679151280406L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "user_id", nullable = false, referencedColumnName = "user_id")
  private User user;

  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "authority_id", nullable = false, referencedColumnName = "id")
  private Authority authority;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public Authority getAuthority() {
    return authority;
  }

  public void setAuthority(Authority authority) {
    this.authority = authority;
  }
}
