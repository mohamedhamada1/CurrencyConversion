import com.android.build.api.dsl.ApplicationProductFlavor
import com.android.build.api.dsl.LibraryProductFlavor
import org.gradle.api.NamedDomainObjectContainer

enum class Flavor(val flavorName: String) {
    Development("dev"),
    QA("qa"),
    Production("prod");

    companion object {
        fun flavor(name: String) = values().firstOrNull { it.flavorName == name }
            ?: Development
    }
}

interface BuildFlavor {
    val flavor: Flavor

    fun libraryCreate(
        objectContainer: NamedDomainObjectContainer<LibraryProductFlavor>
    ): LibraryProductFlavor

    fun appCreate(
        objectContainer: NamedDomainObjectContainer<ApplicationProductFlavor>
    ): ApplicationProductFlavor
}

object FlavorDevelopment : BuildFlavor {
    override val flavor = Flavor.Development

    override fun appCreate(
        objectContainer: NamedDomainObjectContainer<ApplicationProductFlavor>
    ) = objectContainer.create(
        flavorName = flavor.flavorName,
        dimensionName = BuildDimensions.ENVIRONMENT
    )

    override fun libraryCreate(
        objectContainer: NamedDomainObjectContainer<LibraryProductFlavor>
    ) = objectContainer.create(
        flavorName = flavor.flavorName,
        dimensionName = BuildDimensions.ENVIRONMENT
    )
}

object FlavorQA : BuildFlavor {
    override val flavor = Flavor.QA

    override fun appCreate(
        objectContainer: NamedDomainObjectContainer<ApplicationProductFlavor>
    ) = objectContainer.create(
        flavorName = flavor.flavorName,
        dimensionName = BuildDimensions.ENVIRONMENT
    )

    override fun libraryCreate(
        objectContainer: NamedDomainObjectContainer<LibraryProductFlavor>
    ) = objectContainer.create(
        flavorName = flavor.flavorName,
        dimensionName = BuildDimensions.ENVIRONMENT
    )
}

object FlavorProduction : BuildFlavor {
    override val flavor = Flavor.Production

    override fun appCreate(
        objectContainer: NamedDomainObjectContainer<ApplicationProductFlavor>
    ) = objectContainer.create(
        flavorName = flavor.flavorName,
        dimensionName = BuildDimensions.ENVIRONMENT,
        isProduction = true
    )

    override fun libraryCreate(
        objectContainer: NamedDomainObjectContainer<LibraryProductFlavor>
    ) = objectContainer.create(
        flavorName = flavor.flavorName,
        dimensionName = BuildDimensions.ENVIRONMENT
    )
}

private fun NamedDomainObjectContainer<ApplicationProductFlavor>.create(
    flavorName: String,
    dimensionName: String,
    isProduction: Boolean = false
) = this.create(flavorName) {
    if (!isProduction) {
        applicationIdSuffix = ".$flavorName"
        versionNameSuffix = "-$flavorName"
    }
    dimension = dimensionName
}

private fun NamedDomainObjectContainer<LibraryProductFlavor>.create(
    flavorName: String,
    dimensionName: String
) = this.create(flavorName) {
    dimension = dimensionName
}
