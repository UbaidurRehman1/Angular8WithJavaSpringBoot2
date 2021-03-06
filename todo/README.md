<h2 align="center">Basic ng commands</h2>
<ol>
    <li><strong>ng new app-name</strong> is used to create new angular project</li>
    <li><strong>ng lint</strong> is used to check the violation from standards in the project</li>
    <li><strong>ng build</strong> is used to build this project for production purpose</li>
    <li><strong>ng test</strong> is used to test this application using karma framework</li>
    <li><strong>ng e2e</strong> is used to test this application using jasmine framework (selenium automation)</li>
</ol>

<h2 align="center">Interpolation</h2>
<ol>
    <li><strong>"{{var}}"</strong> which is declared in the .ts file</li>
</ol>

<h2 align="center">Event Binding</h2>
<ol>
    <li><strong>(event)="methodName(*)"</strong> methodName(*) must be defined in .ts file</li>
</ol>

<h2 align="center">Two way Data binding</h2>
<ol>
    <li><strong>[(ngModule)]="var"</strong> where var is the value in the .ts file</li>
</ol>

<h2 align="center">*ngIf</h2>
<ol>
    <li><strong>*ngIf="boolean var"</strong> where var is the value in the .ts file</li>
</ol>


<h2 align="center">Routing</h2>
<ol>
    <li>create <strong>Routes</strong> array in the module.ts and in imports register it using <strong>RouterModule.forRoot(Routes)</strong></li>
    <li>The objects in the Routes contain path: and component: </li>
</ol>

<h2 align="center">Dependency Injection in Angular8</h2>
<ol>
    <li>Dependency Injection <strong>is built in feature</strong> of Angular</li>
    <li>Simply put the dependent type in the constructor and use in the class</li>
</ol>

<h2 align="center">Redirection</h2>
<ol>
    <li>So we can redirect from one page to another</li>
    <li>Simply inject Router in the required .ts file and then call its navigate method to go desired page</li>
</ol>

<h2 align="center">Path Variable</h2>
<ol>
    <li>In app-routing.module.ts change the router path to path:var where var is our variable in the url path</li>
    <li>Now get path variable using ActivatedRouter [inject it first] and then get the parameter using: -></li>
    <li>this.ActivatedRouter(instance).snapshot.params['pathvariable name']</li>
</ol>

<h2 align="center">*ngFor</h2>
<ol>
    <li>This used for iteration</li>
    <li>Expression: *ngFor="let var of vars"</li>
    <li>var will be object in the array, we can use var</li>
</ol>

<h2 align="center">routerLink</h2>
<ol>
    <li>Alternate for href</li>
    <li>It is not refreshed the page while href load whole page</li>
    <li>ud in anchor tag</li>
    <li>simply place name of the path</li>
</ol>

<h2 align="center">Classes in TypeScript</h2>
<ol>
    <li>When we write variables in the constructor it becomes field variables in type script class</li>
</ol>

<h2 align="center">Pipe</h2>
<ol>
    <li>is used to format items</li>
    <li>expression: object | format</li>
    <li>Here, I used datePip {{date | date:'medium"}} etc</li>
</ol>

<h2 align="center">Service</h2>
<ol>
    <li>Service is class which is injectable in root</li>
    <li>so we can get at any level this class</li>
    <li>ng generate service from/path/to</li>
</ol>

<h2 align="center">Session Storage</h2>
<ol>
    <li>We can store any info in key value pair in our session</li>
    <li>is dependant on browser</li>
    <li>as soon as browser closed, session will destory</li>
</ol>

<h2 align="center">CanActivate Interface</h2>
<ol>
    <li>We create a routeGaurd service and implement this service with CanActivate</li>
    <li>We implement the method and return true if user is logged in</li>
    <li>otherwise false</li>
    <li>we can redirect our page to login page if user is not logged in</li>
    <li>Then we add canActivate field in our path in app-routing-module.ts</li>
</ol>

<h2 align="center">HttpClient</h2>
<ol>
    <li>To get data from the web services, we use HttpCleint</li>
    <li>Import HttpClientModule in app.module.ts</li>
    <li>Inject HttpClient newly made class in data folder</li>
    <li>and then using get method of httpClient return the Observable</li>
    <li>In the component class, use this observales, as success reponse, error respose etc</li>
</ol>

<h2 align="center">Tick Trick</h2>
<ol>
    <li>use `expression`</li>
    <li>e.g. `path/to/${name}`</li>
</ol>

<h2 align="center">Upcasting</h2>
<ol>
    <li>let todo = response as Todo[]</li>
    <li><strong>as</strong> keyword is used for upcasting</li>
</ol>

<h2 align="center">[(ngModel)] explanation</h2>
<ol>
    <li>[(ngModel)] can be devided in: </li>
    <li>[ngModel] = "var" and</li>
    <li>(ngModelChange) = "var = $event"</li>
    <li>For some instance if, ts compiler produce error on [(ngModel)] then we can split as above mentioned</li>
</ol>


<h2 align="center">Form Validation</h2>
<ol>
    <li>We can include form tag and then we include (ngSubmit)="methodName()" stead in submit button</li>
    <ol>
        <li>The name of all form inputs should have name</li>
    </ol>
    <li>Template Variable</li>
    <ol>
        <li>We can add #templateName = "ngModel" in inputs field and</li>
        <li>We can add #templateName = "ng-form" in form tag</li>
        <li>We can use these template variables in expressions</li>
    </ol>
    <li>Validation</li>
    <ol>
        <li>.ng-invalid is class we can use in css to indicate if something is invalid</li>
        <li>There are some more validation tags such as `minlenght`</li>
        <li>We can use tempalteVariable to show alerts if something is invalid</li>
    </ol>
    <li>For some instance if, ts compiler produce error on [(ngModel)] then we can split as above mentioned</li>
</ol>

<h2 align="center">Authentication</h2>
<ol>
    <li>Basic Authentication</li>
    <ol>
        <li>For basic authentication we have to creaet a Authorization header</li>
        <li>Create a method which return a Auth String having format `Basic username:password`</li>
        <li>The username:password should be in 64 bit string. Use window.btao to convert them in 64 bit</li>
        <li>Create header using let header = new HttpHeader({'Authorizaton' : authString})</li>
        <li>Put this header as object in the getReqest after the url</li>
    </ol>
</ol>

<h2 align="center">HTTP Intercepter</h2>
<ol>
    <li>Create a Service and implement it with HttpInterceptor</li>
    <li>Implement the method and, first update the request with header using: </li>
    <ol>
        <li>req = req.clone({headers})</li>
    </ol>
    <li>return => next.handle(req)</li>
    <li>Add {provide : HTTP_INTERCEPTORS, useClass : HttpIntercepterService, multi : true} in providers in app.module.ts</li>
</ol>

<h2 align="center">Angular Authentication Service</h2>
<ol>
    <li>Create a service </li>
    <li>Then create a get request give the auth header</li>
    <ol>
        <li>Use pipe with get request (and then map to set sessionStorge) 'check out the basicAuthService</li>
    </ol>
    <li>In the login component, execute the service, if success then process to welcome page</li>
    <li>otherwise give invalid credentials</li>
</ol>
