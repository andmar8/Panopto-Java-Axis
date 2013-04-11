Panopto-Java-Axis
=================

This is very similar to the [PanoptoUtil](https://github.com/andmar8/Panopto-Java-Util) library, and if you wanted to place stub references to every API endpoint in the PanoptoUtil library you *could* actually use that instead, however there would be extraneous unused code carried with it, and so this library ONLY contains the Panopto API AXIS stubs and has a stub for EVERY v4.2 API endpoint, i.e.

1. AccessManagement
2. Auth
3. RemoteRecorderManagement
4. SessionManagement
5. UserManagement

How to use the code
-------------------

The code provided here has example URL's in it so you will need to roll your own stubs using the instructions outlined [here](https://github.com/andmar8/Blackboard-Java-BB9.1-Plugin-for-Panopto/blob/master/README.md#creating-the-axis-162-stubs-for-your-server).

It *should* also be possible to take the example stubs and use them by explicitly specifying your endpoint in the code when you reference them using something like....

<pre>
	SessionManagementStub sessionClient = new SessionManagementStub("https://panoptoserver.example.com/Panopto/PublicAPISSL/4.2/SessionManagement.svc?wsdl");
</pre>

...but I haven't tried that as of yet.
