# ICE_Assignment

* Manage packets in a router: A packet can contain either management data or user data. A packet can also be either large or small (two discrete values).
 
* Allows packets to be entered into the system (just with a method call -- no need for any type of user interface)
 
* Allows the highest priority packet to be removed from the system – management data is always higher priority than user data. Within a given type (management or user), a large packet is higher priority than a small packet. All else being equal, packets that have been in the queue longer should be removed before packets that have not been waiting as long.
 
Things to think about when you are working on this:  Because this is at heart an algorithms problem, I'd like to see optimization for performance and concurrency.  How might one optimize for other factors such as extensibility?  You don’t need to necessarily code anything beyond the problem above, though.
