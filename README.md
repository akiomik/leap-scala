leap-scala
==========

A thin scala wrapper library for leap motion

## Installation

1. Download the leap motion SDK.
2. Move `LeapDeveloperKit/LeapSDK/lib/LeapJava.jar` to `leap-scala/lib/`.
3. Publish this library to local repository.

  ```sh
sbt publish-local
  ```
  
4. Add library dependency to your sbt project.

  ```scala
libraryDependencies ++= Seq(
      "com.github.akiomik" %% "leap-scala" % "0.1.0"
)
  ```

5. Add following line to your scala code.

  ```scala
import com.github.akiomik.leap_scala.Imports._
  ```
  
## Sample
```scala
import com.github.akiomik.leap_scala.Imports._

object SampleApp {
  def main(args: Array[String]) {
    val controller = new Controller()
    val listener = new SampleListener()

    controller.addListener(listener)
    readLine("Press Enter to quit...\n")
    controller.removeListener(listener)
  }
}

class SampleListener extends Listener {
  // do something ...
}
```
  
## Licence
The MIT License. See `LICENSE` file.
