import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { DataServiceService, HelloWorldBean } from 'src/app/services/data/data-service.service';

@Component({
  selector: 'app-welcome',
  templateUrl: './welcome.component.html',
  styleUrls: ['./welcome.component.css']
})
export class WelcomeComponent implements OnInit
{
    private name : string = '';

    private message : string;
    private error : string;

    constructor(private route:ActivatedRoute,
        private dataService : DataServiceService)
    {

    }

    ngOnInit()
    {
        this.name = this.route.snapshot.params['name'];
    }

    private getMessage() : string
    {
        console.log("Executing getMessage() at welcome component")
        this.dataService.executeHelloWorldService().subscribe(
            response => this.handleSuccessFulResponse(response),
            error => this.handleError(error)
        )
        console.log("Ending getMessage() at welcome component");
        return null;
    }

    private handleSuccessFulResponse(response : any) : void
    {
        this.message = response.message;
        // console.log(response.message);
    }

    private handleError(error : any) : void
    {
        this.error = error.error.message;
    }

}
