### About this library

#### Main purpose
Library defines and interface and autoconfiguration for defining logins which should 
be given a special role in the security configuration.

#### Main workflow
Library adds an authentication provider which supporting `UsernamePasswordAuthenticationToken` 
authentication tokens, and checks if for a username/login there is a `GodModeLoginsProvider`
which accepts this username/login as a special 'GodMode' username. If yes, the authentication
provider adds a role (`GrantedAuthority`): 

```java
new SimpleGrantedAuthority("ROLE_GOD_MODE")
```

to the authentication token and forwards it for further processing. 

#### Login providers
Clients of the library can defined their own 'GodMode' login providers (one or more)
which will be detected by autoconfiguration and used in the logic. Otherwise a default (library)
implementation would be autoconfigured.

##### Defaults
Default godmode logins/usernames (if not defined by lib's clients):
* `godmode`
* `superuser`
* `god`
