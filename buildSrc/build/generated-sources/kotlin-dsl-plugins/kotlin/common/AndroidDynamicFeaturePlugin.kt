package common


/**
 * Precompiled [android-dynamic-feature.gradle.kts][common.Android_dynamic_feature_gradle] script plugin.
 *
 * @see common.Android_dynamic_feature_gradle
 */
class AndroidDynamicFeaturePlugin : org.gradle.api.Plugin<org.gradle.api.Project> {
    override fun apply(target: org.gradle.api.Project) {
        try {
            Class
                .forName("common.Android_dynamic_feature_gradle")
                .getDeclaredConstructor(org.gradle.api.Project::class.java, org.gradle.api.Project::class.java)
                .newInstance(target, target)
        } catch (e: java.lang.reflect.InvocationTargetException) {
            throw e.targetException
        }
    }
}
