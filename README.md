# refreshive

Trying test-refresh inside Cursive


## Usage

* `idea .` to open this project in Cursive
* Right click the project.clj file and select run REPL
* Open the test_refresh.clj file, switch namespace and evaluate it in the REPL (ctrl+shift+N, ctrl+shift+M)
* In the repl enter `(start)`

See the (verbose) stacktrace with clickable links.
Editing the test definition on line 73 of test_refresh.clj causes reload/run.
Tests in other files don't seem to be discovered, not sure why yet.
The REPL is no longer usable, `(start)` blocks it...
Running it in a future doesn't work because of thread bindings (there must be a solution).


## License

Copyright © 2016 Timothy Pratley

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
