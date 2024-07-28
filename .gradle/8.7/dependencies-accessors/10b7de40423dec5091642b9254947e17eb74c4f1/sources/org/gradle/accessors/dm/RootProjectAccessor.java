package org.gradle.accessors.dm;

import org.gradle.api.NonNullApi;
import org.gradle.api.artifacts.ProjectDependency;
import org.gradle.api.internal.artifacts.dependencies.ProjectDependencyInternal;
import org.gradle.api.internal.artifacts.DefaultProjectDependencyFactory;
import org.gradle.api.internal.artifacts.dsl.dependencies.ProjectFinder;
import org.gradle.api.internal.catalog.DelegatingProjectDependency;
import org.gradle.api.internal.catalog.TypeSafeProjectDependencyFactory;
import javax.inject.Inject;

@NonNullApi
public class RootProjectAccessor extends TypeSafeProjectDependencyFactory {


    @Inject
    public RootProjectAccessor(DefaultProjectDependencyFactory factory, ProjectFinder finder) {
        super(factory, finder);
    }

    /**
     * Creates a project dependency on the project at path ":"
     */
    public LonghrkProjectDependency getLonghrk() { return new LonghrkProjectDependency(getFactory(), create(":")); }

    /**
     * Creates a project dependency on the project at path ":app"
     */
    public AppProjectDependency getApp() { return new AppProjectDependency(getFactory(), create(":app")); }

    /**
     * Creates a project dependency on the project at path ":benchmarks"
     */
    public BenchmarksProjectDependency getBenchmarks() { return new BenchmarksProjectDependency(getFactory(), create(":benchmarks")); }

    /**
     * Creates a project dependency on the project at path ":core"
     */
    public CoreProjectDependency getCore() { return new CoreProjectDependency(getFactory(), create(":core")); }

    /**
     * Creates a project dependency on the project at path ":feature"
     */
    public FeatureProjectDependency getFeature() { return new FeatureProjectDependency(getFactory(), create(":feature")); }

    /**
     * Creates a project dependency on the project at path ":lint"
     */
    public LintProjectDependency getLint() { return new LintProjectDependency(getFactory(), create(":lint")); }

    /**
     * Creates a project dependency on the project at path ":sync"
     */
    public SyncProjectDependency getSync() { return new SyncProjectDependency(getFactory(), create(":sync")); }

    /**
     * Creates a project dependency on the project at path ":ui-test-hilt-manifest"
     */
    public UiTestHiltManifestProjectDependency getUiTestHiltManifest() { return new UiTestHiltManifestProjectDependency(getFactory(), create(":ui-test-hilt-manifest")); }

}
