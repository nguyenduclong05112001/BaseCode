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
public class CoreProjectDependency extends DelegatingProjectDependency {

    @Inject
    public CoreProjectDependency(TypeSafeProjectDependencyFactory factory, ProjectDependencyInternal delegate) {
        super(factory, delegate);
    }

    /**
     * Creates a project dependency on the project at path ":core:analytics"
     */
    public Core_AnalyticsProjectDependency getAnalytics() { return new Core_AnalyticsProjectDependency(getFactory(), create(":core:analytics")); }

    /**
     * Creates a project dependency on the project at path ":core:common"
     */
    public Core_CommonProjectDependency getCommon() { return new Core_CommonProjectDependency(getFactory(), create(":core:common")); }

    /**
     * Creates a project dependency on the project at path ":core:data"
     */
    public Core_DataProjectDependency getData() { return new Core_DataProjectDependency(getFactory(), create(":core:data")); }

    /**
     * Creates a project dependency on the project at path ":core:data-test"
     */
    public Core_DataTestProjectDependency getDataTest() { return new Core_DataTestProjectDependency(getFactory(), create(":core:data-test")); }

    /**
     * Creates a project dependency on the project at path ":core:database"
     */
    public Core_DatabaseProjectDependency getDatabase() { return new Core_DatabaseProjectDependency(getFactory(), create(":core:database")); }

    /**
     * Creates a project dependency on the project at path ":core:datastore"
     */
    public Core_DatastoreProjectDependency getDatastore() { return new Core_DatastoreProjectDependency(getFactory(), create(":core:datastore")); }

    /**
     * Creates a project dependency on the project at path ":core:datastore-proto"
     */
    public Core_DatastoreProtoProjectDependency getDatastoreProto() { return new Core_DatastoreProtoProjectDependency(getFactory(), create(":core:datastore-proto")); }

    /**
     * Creates a project dependency on the project at path ":core:datastore-test"
     */
    public Core_DatastoreTestProjectDependency getDatastoreTest() { return new Core_DatastoreTestProjectDependency(getFactory(), create(":core:datastore-test")); }

    /**
     * Creates a project dependency on the project at path ":core:designsystem"
     */
    public Core_DesignsystemProjectDependency getDesignsystem() { return new Core_DesignsystemProjectDependency(getFactory(), create(":core:designsystem")); }

    /**
     * Creates a project dependency on the project at path ":core:domain"
     */
    public Core_DomainProjectDependency getDomain() { return new Core_DomainProjectDependency(getFactory(), create(":core:domain")); }

    /**
     * Creates a project dependency on the project at path ":core:model"
     */
    public Core_ModelProjectDependency getModel() { return new Core_ModelProjectDependency(getFactory(), create(":core:model")); }

    /**
     * Creates a project dependency on the project at path ":core:network"
     */
    public Core_NetworkProjectDependency getNetwork() { return new Core_NetworkProjectDependency(getFactory(), create(":core:network")); }

    /**
     * Creates a project dependency on the project at path ":core:notifications"
     */
    public Core_NotificationsProjectDependency getNotifications() { return new Core_NotificationsProjectDependency(getFactory(), create(":core:notifications")); }

    /**
     * Creates a project dependency on the project at path ":core:screenshot-testing"
     */
    public Core_ScreenshotTestingProjectDependency getScreenshotTesting() { return new Core_ScreenshotTestingProjectDependency(getFactory(), create(":core:screenshot-testing")); }

    /**
     * Creates a project dependency on the project at path ":core:testing"
     */
    public Core_TestingProjectDependency getTesting() { return new Core_TestingProjectDependency(getFactory(), create(":core:testing")); }

    /**
     * Creates a project dependency on the project at path ":core:ui"
     */
    public Core_UiProjectDependency getUi() { return new Core_UiProjectDependency(getFactory(), create(":core:ui")); }

}
