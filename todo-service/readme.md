<h1>Spring Boot Web Service</h1>

<h2 align="center">@CrossOrigin(origins)</h2>
<ol>
    <li>We use @CrossOrigin(origins) to allow access from different server</li>
</ol>

<h2 align="center">Populating using static {}</h2>
<ol>
    <li>You can declare a static field, and you can populate it using static { //here your code go }</li>
</ol>

<h2 align="center">Response Entity</h2>
<ol>
    <li>On update or delete request, we may enter ReponseEntity</li>
    <li>We can return ResponseEntity.ok().build() on success or</li>
    <li>ResponseEntity.notFound().build() when item is not present etc</li>
</ol>


<h2 align="center">Different Response Entity</h2>
<ol>
    <li>For Delete return OK Response Entity</li>
    <li>For Add (POST Mapping) return location Response Entity</li>
    <li>For Update (PUT Mapping) return ResponseEntity<T, OK></li>
</ol>

<h2 align="center">Configure Web Security</h2>
<ol>
    <li>Basic Auth</li>
    <ol>
    	<li>Extend WebSecurityConfigurerAdapter and override configure(HttpSecurity) method</li>
    	<li>In this method, first disable csrf using http.csrf().disable()</li>
    	<li>Then authorized every OPTIONS request using .authorized().antMatcher(HttpMethod.OPTIONS, "/**").permitAll()</li>
		<ol>
			When we put header, then before generating GET request, Angular will create OPTIONS request. If it has response code
			200 then our GET request go to the server
		</ol>
		<li>All other than OPTIONS request, we have to do authentication using anyRequest().authenticated()</li>
		<li>After that, we use basic auth method using .and().httpBasic()</li>
    </ol>
</ol>


<h2 align="center">JWT Authentication</h2>
<ol>
    <li>JSON WEB Token</li>
    <li>Configure JWT framework</li>
    <li>Maven dependency jjwt</li>
    <li>Check out the configuration at .properties file</li>
</ol>

<h2 align="center">H2 Database</h2>
<ol>
    <li>H2 is in memory database</li>
    <li>we can access using /h2-console</li>
    <li>Make Todo Entity and set @Id and @GeneratedValue annotation on id</li>
    <li>Spring Data will automatically generate the table</li>
    <li>Create data.sql file and insert some values</li>
</ol>

<h2 align="center">Spring Data (H2 Database)</h2>
<ol>
    <li>So, we can create custom native queries</li>
    <li>For update and delete and create, return type is null or int</li>
    <li>and they require transaction management hint[use @Transactional annotation at service]</li>
    <li>For more info: check out JPADAO</li>
</ol>

