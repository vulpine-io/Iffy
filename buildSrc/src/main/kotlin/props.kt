import org.gradle.api.JavaVersion
import javax.lang.model.SourceVersion

data class Developer(
  val id: String,
  val name: String,
  val email: String,
  val site: String
)

object Project {
  val name = "Iffy"
  val description = "Either type for Java"
  val group = "io.vulpine.lib"
  val version = "1.0.1"
  val site = "https://github.com/Vulpine-IO/Iffy"
  val issues = "https://github.com/Vulpine-IO/Iffy/issues"
  val license = "MIT"
}

object Scm {
  val connection = "scm:git:git://github.com/Vulpine-IO/Iffy.git"
  val devConnection = "scm:git:ssh://github.com/Vulpine-IO/Iffy.git"
  val url = "https://github.com/Vulpine-IO/Iffy"
}

object Jvm {
  val target = JavaVersion.VERSION_14
}

object Details {
  val project = Project

  val developers = arrayOf(
    Developer("foxcapades", "Elizabeth Paige Harper", "foxcapade@gmail.com", "http://vulpine.io")
  )

  val scm = Scm
}
