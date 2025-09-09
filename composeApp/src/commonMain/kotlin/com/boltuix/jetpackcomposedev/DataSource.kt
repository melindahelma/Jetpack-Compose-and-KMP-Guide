package com.boltuix.jetpackcomposedev

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Code
import org.jetbrains.compose.resources.DrawableResource
import jetpackcomposedev.composeapp.generated.resources.Res
import jetpackcomposedev.composeapp.generated.resources.animategradienttext
import jetpackcomposedev.composeapp.generated.resources.appbars
import jetpackcomposedev.composeapp.generated.resources.badge1
import jetpackcomposedev.composeapp.generated.resources.badges
import jetpackcomposedev.composeapp.generated.resources.bottomsheets
import jetpackcomposedev.composeapp.generated.resources.buttons
import jetpackcomposedev.composeapp.generated.resources.cards
import jetpackcomposedev.composeapp.generated.resources.carousel
import jetpackcomposedev.composeapp.generated.resources.checkbox
import jetpackcomposedev.composeapp.generated.resources.chips
import jetpackcomposedev.composeapp.generated.resources.compose19release
import jetpackcomposedev.composeapp.generated.resources.datepicker
import jetpackcomposedev.composeapp.generated.resources.dialogs
import jetpackcomposedev.composeapp.generated.resources.dividers
import jetpackcomposedev.composeapp.generated.resources.flipbook
import jetpackcomposedev.composeapp.generated.resources.floatingactionbutton
import jetpackcomposedev.composeapp.generated.resources.iconbutton
import jetpackcomposedev.composeapp.generated.resources.imageoptimizationtips
import jetpackcomposedev.composeapp.generated.resources.jetpackcomposedev
import jetpackcomposedev.composeapp.generated.resources.kmp
import jetpackcomposedev.composeapp.generated.resources.lists
import jetpackcomposedev.composeapp.generated.resources.menus
import jetpackcomposedev.composeapp.generated.resources.navigationbar
import jetpackcomposedev.composeapp.generated.resources.navigationdrawer
import jetpackcomposedev.composeapp.generated.resources.navigationrail
import jetpackcomposedev.composeapp.generated.resources.progressindicators
import jetpackcomposedev.composeapp.generated.resources.radiobutton
import jetpackcomposedev.composeapp.generated.resources.scaffold
import jetpackcomposedev.composeapp.generated.resources.search
import jetpackcomposedev.composeapp.generated.resources.segmentedbutton
import jetpackcomposedev.composeapp.generated.resources.sliders
import jetpackcomposedev.composeapp.generated.resources.snackbar
import jetpackcomposedev.composeapp.generated.resources.switch
import jetpackcomposedev.composeapp.generated.resources.tabs
import jetpackcomposedev.composeapp.generated.resources.textfields
import jetpackcomposedev.composeapp.generated.resources.timepickers
import jetpackcomposedev.composeapp.generated.resources.tooltips
import jetpackcomposedev.composeapp.generated.resources.badge1
import jetpackcomposedev.composeapp.generated.resources.badge2
import jetpackcomposedev.composeapp.generated.resources.badge3
import jetpackcomposedev.composeapp.generated.resources.badge4
import jetpackcomposedev.composeapp.generated.resources.badge5
import jetpackcomposedev.composeapp.generated.resources.badge6
import jetpackcomposedev.composeapp.generated.resources.badge7
import jetpackcomposedev.composeapp.generated.resources.badge8
import jetpackcomposedev.composeapp.generated.resources.badge9
import jetpackcomposedev.composeapp.generated.resources.badge10
import jetpackcomposedev.composeapp.generated.resources.badge11
import jetpackcomposedev.composeapp.generated.resources.badge12
import jetpackcomposedev.composeapp.generated.resources.badge13
import jetpackcomposedev.composeapp.generated.resources.badge14
import jetpackcomposedev.composeapp.generated.resources.badge15
import jetpackcomposedev.composeapp.generated.resources.badge16
import jetpackcomposedev.composeapp.generated.resources.badge17
import jetpackcomposedev.composeapp.generated.resources.badge18
import jetpackcomposedev.composeapp.generated.resources.badge19
import jetpackcomposedev.composeapp.generated.resources.badge20
import jetpackcomposedev.composeapp.generated.resources.badge21
import jetpackcomposedev.composeapp.generated.resources.badge22
import jetpackcomposedev.composeapp.generated.resources.badge23
import jetpackcomposedev.composeapp.generated.resources.badge24
import jetpackcomposedev.composeapp.generated.resources.badge25
import jetpackcomposedev.composeapp.generated.resources.badge26
import jetpackcomposedev.composeapp.generated.resources.badge27
import jetpackcomposedev.composeapp.generated.resources.bookkotlin
import jetpackcomposedev.composeapp.generated.resources.composenew
import jetpackcomposedev.composeapp.generated.resources.jetcaster
import jetpackcomposedev.composeapp.generated.resources.jetchat
import jetpackcomposedev.composeapp.generated.resources.jetlagged
import jetpackcomposedev.composeapp.generated.resources.jetnews
import jetpackcomposedev.composeapp.generated.resources.jetsnack
import jetpackcomposedev.composeapp.generated.resources.reply

data class GridItem(
    val title: String,
    val desc: String,
    val category: String,
    val url: String,
    val imageUrl: DrawableResource? = null
)

object DataSource {

    val categories = listOf(
        "All",
        "Beginner",
        "Experienced",
        "Codelabs",
        "Compose Samples",
        "Material Components",
        "Quick Guides",
        "KMP",
        "Books",
        "Tips",
    )

    val items = listOf(
        GridItem(
            title = "Jetpack Compose Tutorial",
            desc = "In this tutorial, you'll build a simple UI component with declarative functions. You won't be editing any XML layouts or using the Layout Editor. Instead, you will call composable functions to define what elements you want, and the Compose compiler will do the rest.",
            category = "Beginner",
            url = "https://developer.android.com/develop/ui/compose/tutorial",
        ),

        GridItem(
            title = "Kotlin Basics & Android Setup",
            desc = "Learn introductory programming concepts in Kotlin. Setup Android Studio. Duration: 3 hours.",
            category = "Beginner",
            url = "https://developer.android.com/courses/pathways/android-basics-compose-unit-1-pathway-1",
            imageUrl = Res.drawable.badge1
        ),
        GridItem(
            title = "First Android Project",
            desc = "Install and set up Android Studio, create your first project, and run it on a device or emulator. Build a basic layout. Duration: 4 hours.",
            category = "Beginner",
            url = "https://developer.android.com/courses/pathways/android-basics-compose-unit-1-pathway-2",
            imageUrl = Res.drawable.badge2
        ),
        GridItem(
            title = "Simple UI App",
            desc = "Build an Android app with a simple user interface that displays text and images. Duration: 3 hours.",
            category = "Beginner",
            url = "https://developer.android.com/courses/pathways/android-basics-compose-unit-1-pathway-3",
            imageUrl = Res.drawable.badge3
        ),
        GridItem(
            title = "Kotlin Fundamentals & Interactive Apps",
            desc = "Learn more fundamentals of Kotlin, object-oriented programming, and lambdas. Add a button to an app. Duration: 8 hours.",
            category = "Beginner",
            url = "https://developer.android.com/courses/pathways/android-basics-compose-unit-2-pathway-1",
            imageUrl = Res.drawable.badge4
        ),
        GridItem(
            title = "UI Interaction & State",
            desc = "Learn how to respond to a button click in an Android app. Duration: 6 hours.",
            category = "Beginner",
            url = "https://developer.android.com/courses/pathways/android-basics-compose-unit-2-pathway-2",
            imageUrl = Res.drawable.badge5
        ),
        GridItem(
            title = "Tip Calculator App",
            desc = "Create a tip calculator app that calculates the tip from user input. Use Material Design to build modern and intuitive user interfaces. Duration: 7 hours.",
            category = "Beginner",
            url = "https://developer.android.com/courses/pathways/android-basics-compose-unit-2-pathway-3",
            imageUrl = Res.drawable.badge6
        ),
        GridItem(
            title = "More Kotlin Fundamentals",
            desc = "Learn additional Kotlin programming concepts that will enable you to build more interesting and fun Android apps. Duration: 8 hours.",
            category = "Beginner",
            url = "https://developer.android.com/courses/pathways/android-basics-compose-unit-3-pathway-1",
            imageUrl = Res.drawable.badge7
        ),
        GridItem(
            title = "Scrollable List App",
            desc = "Create an app that displays a scrollable list of text and images using Compose. Duration: 4 hours.",
            category = "Beginner",
            url = "https://developer.android.com/courses/pathways/android-basics-compose-unit-3-pathway-2",
            imageUrl = Res.drawable.badge8
        ),
        GridItem(
            title = "Beautiful UI & Animations",
            desc = "Make your apps more beautiful and intuitive to use with Material Design, animations, and accessibility best practices. Duration: 3 hours.",
            category = "Beginner",
            url = "https://developer.android.com/courses/pathways/android-basics-compose-unit-3-pathway-3",
            imageUrl = Res.drawable.badge9
        ),
        GridItem(
            title = "App Architecture Basics",
            desc = "Learn about app architecture and how to use ViewModels, UI State, and StateFlow to build more complex apps. Duration: 9 hours.",
            category = "Beginner",
            url = "https://developer.android.com/courses/pathways/android-basics-compose-unit-4-pathway-1",
            imageUrl = Res.drawable.badge10
        ),
        GridItem(
            title = "Navigation in Jetpack Compose",
            desc = "Learn how to use the Navigation component to build more complex apps with more screens and how to navigate and pass data between different composables. Duration: 6 hours.",
            category = "Beginner",
            url = "https://developer.android.com/courses/pathways/android-basics-compose-unit-4-pathway-2",
            imageUrl = Res.drawable.badge11
        ),
        GridItem(
            title = "Responsive UI & Testing",
            desc = "Learn how to adapt your app to different screen sizes and provide a better user experience, as well as how to test your adaptive UI. Duration: 13 hours.",
            category = "Beginner",
            url = "https://developer.android.com/courses/pathways/android-basics-compose-unit-4-pathway-3",
            imageUrl = Res.drawable.badge12
        ),
        GridItem(
            title = "Get Data from the Internet",
            desc = "Implement coroutines to perform tasks concurrently without blocking the app, and learn about HTTP and REST to get data from the internet. Duration: 6 hours.",
            category = "Beginner",
            url = "https://developer.android.com/courses/pathways/android-basics-compose-unit-5-pathway-1",
            imageUrl = Res.drawable.badge13
        ),
        GridItem(
            title = "Load and Display Images",
            desc = "Apply architecture best practices to the app and use Coil to download and display images. Duration: 3 hours.",
            category = "Beginner",
            url = "https://developer.android.com/courses/pathways/android-basics-compose-unit-5-pathway-2",
            imageUrl = Res.drawable.badge14
        ),
        GridItem(
            title = "Introduction to SQL",
            desc = "Learn how to use SQL to read and manipulate data in a relational database. Duration: 2 hours.",
            category = "Beginner",
            url = "https://developer.android.com/courses/pathways/android-basics-compose-unit-6-pathway-1",
            imageUrl = Res.drawable.badge15
        ),
        GridItem(
            title = "Use Room for Data Persistence",
            desc = "Use the Room library to easily create and use relational databases in an Android app. Duration: 6 hours.",
            category = "Beginner",
            url = "https://developer.android.com/courses/pathways/android-basics-compose-unit-6-pathway-2",
            imageUrl = Res.drawable.badge16
        ),
        GridItem(
            title = "Store and Access Data with DataStore",
            desc = "Learn how to store simple, key-value pair data with Preferences DataStore in an Android app. Duration: 2 hours.",
            category = "Beginner",
            url = "https://developer.android.com/courses/pathways/android-basics-compose-unit-6-pathway-3",
            imageUrl = Res.drawable.badge17
        ),
        GridItem(
            title = "Schedule Tasks with WorkManager",
            desc = "Learn when and how to use WorkManager, an API that handles background work that needs to run regardless of whether the application process is still running. Duration: 3 hours.",
            category = "Beginner",
            url = "https://developer.android.com/courses/pathways/android-basics-compose-unit-7-pathway-1",
            imageUrl = Res.drawable.badge18
        ),
        GridItem(
            title = "Android Views and Compose in Views",
            desc = "Learn the basics of building apps with Android Views and how to add a composable in an app built with Views. Duration: 3 hours.",
            category = "Beginner",
            url = "https://developer.android.com/courses/pathways/android-basics-compose-unit-8-pathway-1",
            imageUrl = Res.drawable.badge19
        ),
        GridItem(
            title = "Views in Compose",
            desc = "Learn how to add and use existing Views inside an app built with Jetpack Compose. Duration: 1 hour.",
            category = "Beginner",
            url = "https://developer.android.com/courses/pathways/android-basics-compose-unit-8-pathway-2",
            imageUrl = Res.drawable.badge20
        ),


        GridItem(
            title = "Compose essentials",
            desc = "Take your first steps with Jetpack Compose and learn about composable functions, basic layouts and state, Material Design, lists and animations.\n\n\n • 10 activities • 1 quiz",
            category = "Experienced",
            url = "https://developer.android.com/courses/pathways/jetpack-compose-for-android-developers-1",
            imageUrl = Res.drawable.badge21
        ),
        GridItem(
            title = "Layouts, theming, and animation",
            desc = "Implement more advanced layouts and add movement and style to your app. You’ll learn about the various Compose Animation APIs, how to implement Material Design 3, how to use custom layouts to implement complex designs, and how you can use lazy layouts to create performant UIs.\n\n\n • 10 activities • 1 quiz",
            category = "Experienced",
            url = "https://developer.android.com/courses/pathways/jetpack-compose-for-android-developers-2",
            imageUrl = Res.drawable.badge22
        ),
        GridItem(
            title = "Architecture and state",
            desc = "Learn how to create a functioning app, using navigation, advanced state and side effects.\n\n\n • 8 activities • 1 quiz",
            category = "Experienced",
            url = "https://developer.android.com/courses/pathways/jetpack-compose-for-android-developers-3",
            imageUrl = Res.drawable.badge23
        ),
        GridItem(
            title = "Accessibility, testing, and performance",
            desc = "Improve your app’s performance, make it accessible for all users, and write automated tests to keep this behavior.\n\n\n • 9 activities • 1 quiz",
            category = "Experienced",
            url = "https://developer.android.com/courses/pathways/jetpack-compose-for-android-developers-4",
            imageUrl = Res.drawable.badge24
        ),
        GridItem(
            title = "Form factors",
            desc = "Use Jetpack Compose to develop apps for multiple screen formats and device types.\n\n\n • 5 activities • 1 quiz",
            category = "Experienced",
            url = "https://developer.android.com/courses/pathways/jetpack-compose-for-android-developers-5",
            imageUrl = Res.drawable.badge25
        ),
        GridItem(
            title = "Android app architecture",
            desc = "Learn about best practices and recommended architecture for building robust, production-quality apps.\n\n\n • 14 activities • 1 quiz",
            category = "Experienced",
            url = "https://developer.android.com/courses/pathways/android-architecture",
            imageUrl = Res.drawable.badge26
        ),
        GridItem(
            title = "Accessibility",
            desc = "Learn to make your Android apps usable by everyone, including people with accessibility needs.\n\n\n • 6 activities • 1 quiz",
            category = "Experienced",
            url = "https://developer.android.com/courses/pathways/make-your-android-app-accessible",
            imageUrl = Res.drawable.badge27
        ),


        GridItem(
            title = "JetNews",
            desc = "A sample blog post viewer that demonstrates the use of Compose with a typical Material app and real-world architecture.",
            category = "Compose Samples",
            url = "https://github.com/android/compose-samples/tree/main/JetNews",
            imageUrl = Res.drawable.jetnews
        ),
        GridItem(
            title = "Jetchat",
            desc = "A sample chat app that focuses on UI state patterns and text input.",
            category = "Compose Samples",
            url = "https://github.com/android/compose-samples/tree/main/Jetchat",
            imageUrl = Res.drawable.jetchat
        ),
        GridItem(
            title = "Jetsnack",
            desc = "Jetsnack is a sample snack ordering app built with Compose.",
            category = "Compose Samples",
            url = "https://github.com/android/compose-samples/tree/main/Jetsnack",
            imageUrl = Res.drawable.jetsnack
        ),
        GridItem(
            title = "Jetcaster",
            desc = "A sample podcast app featuring a Redux-style architecture, dynamic themes, and Room integration.",
            category = "Compose Samples",
            url = "https://github.com/android/compose-samples/tree/main/Jetcaster",
            imageUrl = Res.drawable.jetcaster
        ),
        GridItem(
            title = "Reply",
            desc = "A Compose implementation of the Reply material study, focusing on adaptive design for mobile, tablets, and foldables with Material 3 theming.",
            category = "Compose Samples",
            url = "https://github.com/android/compose-samples/tree/main/Reply",
            imageUrl = Res.drawable.reply

        ),
        GridItem(
            title = "JetLagged",
            desc = "A sample sleep tracker app showcasing custom layouts and graphics in Compose.",
            category = "Compose Samples",
            url = "https://github.com/android/compose-samples/tree/main/JetLagged",
            imageUrl = Res.drawable.jetlagged
        ),
        GridItem(
            title = "SociaLite: An Android Sample App",
            desc = "SociaLite shows how to build social app features like chats, timelines, and media sharing using Jetpack Compose, CameraX, Room, and more. It's a practical example for creating reliable apps with less code, including AI chatbots via Gemini API.",
            category = "Compose Samples",
            url = "https://github.com/android/socialite",
        ),
        GridItem(
            title = "TODO app",
            desc = "A collection of samples to discuss and showcase different architectural tools and patterns for Android apps.",
            category = "Compose Samples",
            url = "https://github.com/android/architecture-samples",
        ),
        GridItem(
            title = "Androidify on Android",
            desc = "Rebuild the fun Android bot maker using modern tools like Jetpack Compose for UI, Gemini API for AI features, CameraX for photos, and Navigation for smooth flow. Create and share custom Android bots with AI-powered creativity.",
            category = "Compose Samples",
            url = "https://github.com/android/androidify",
        ),


        GridItem(
            title = "Jetpack Compose basics",
            desc = "Get started with Compose fundamentals, building simple UIs and understanding composition.",
            category = "Codelabs",
            url = "https://developer.android.com/codelabs/jetpack-compose-basics"
        ),
        GridItem(
            title = "Build a simple app with text composables",
            desc = "Create basic apps using Text composables, learning styling and composition fundamentals.",
            category = "Codelabs",
            url = "https://developer.android.com/codelabs/basic-android-kotlin-compose-text-composables?hl=en"
        ),
        GridItem(
            title = "Practice: Compose Basics",
            desc = "Apply core Compose concepts to solve practical UI building problems and create custom composables.",
            category = "Codelabs",
            url = "https://developer.android.com/codelabs/basic-android-kotlin-compose-composables-practice-problems?hl=en"
        ),
        GridItem(
            title = "Project: Create a Business Card app",
            desc = "Build a complete business card app showcasing Compose layouts, images, and text styling.",
            category = "Codelabs",
            url = "https://developer.android.com/codelabs/basic-android-kotlin-compose-business-card?hl=en"
        ),
        GridItem(
            title = "Intro to state in Compose",
            desc = "Learn fundamental state management concepts in Compose for building interactive UIs.",
            category = "Codelabs",
            url = "https://developer.android.com/codelabs/basic-android-kotlin-compose-using-state?hl=en"
        ),
        GridItem(
            title = "State in Jetpack Compose",
            desc = "Build interactive apps by managing state effectively in Compose, including hoisting and remembering state.",
            category = "Codelabs",
            url = "https://developer.android.com/codelabs/jetpack-compose-state?hl=en"
        ),
        GridItem(
            title = "ViewModel and State in Compose",
            desc = "Use ViewModels to manage and retain UI state across configuration changes in Compose apps.",
            category = "Codelabs",
            url = "https://developer.android.com/codelabs/basic-android-kotlin-compose-viewmodel-and-state?hl=en"
        ),
        GridItem(
            title = "Basic layouts codelab",
            desc = "Learn how to implement real-world designs with the composables and modifiers that Compose provides out of the box.",
            category = "Codelabs",
            url = "https://developer.android.com/codelabs/jetpack-compose-layouts"
        ),
        GridItem(
            title = "Theming in Compose with Material 3",
            desc = "Implement Material 3 theming with dynamic colors and Material You for personalized app experiences.",
            category = "Codelabs",
            url = "https://codelabs.developers.google.com/jetpack-compose-theming?hl=en"
        ),
        GridItem(
            title = "Material Theming with Jetpack Compose",
            desc = "Apply Material Design theming including color, shape, and typography to your Compose app.",
            category = "Codelabs",
            url = "https://developer.android.com/codelabs/basic-android-kotlin-compose-material-theming?hl=en"
        ),
        GridItem(
            title = "Theming codelab",
            desc = "Go hands-on with Compose’s implementation of Material Design to understand theming: colors, typography, shapes, light and dark themes.",
            category = "Codelabs",
            url = "https://developer.android.com/codelabs/jetpack-compose-theming"
        ),
        GridItem(
            title = "Simple Animation with Jetpack Compose",
            desc = "Add basic spring animations to enhance UI interactions in your Compose app.",
            category = "Codelabs",
            url = "https://developer.android.com/codelabs/basic-android-kotlin-compose-woof-animation?hl=en"
        ),
        GridItem(
            title = "Animating elements in Jetpack Compose",
            desc = "Use Compose's animation APIs to add smooth transitions and effects to your UI elements.",
            category = "Codelabs",
            url = "https://developer.android.com/codelabs/jetpack-compose-animation?hl=en"
        ),
        GridItem(
            title = "Navigate between screens with Compose",
            desc = "Set up navigation graphs and pass data between screens in multi-screen Compose apps.",
            category = "Codelabs",
            url = "https://developer.android.com/codelabs/basic-android-kotlin-compose-navigation?hl=en"
        ),
        GridItem(
            title = "Navigation codelab",
            desc = "Learn how to use the Jetpack Navigation library in Compose, navigate with arguments, deep-links, and test your navigation.",
            category = "Codelabs",
            url = "https://developer.android.com/codelabs/jetpack-compose-navigation"
        ),
        GridItem(
            title = "Load and display images from the internet",
            desc = "Use Coil to fetch and show remote images in Compose, with placeholders and error handling.",
            category = "Codelabs",
            url = "https://developer.android.com/codelabs/basic-android-kotlin-compose-load-images?hl=en"
        ),
        GridItem(
            title = "Stages of the Activity lifecycle",
            desc = "Understand and log activity lifecycle events in Compose apps for better state management.",
            category = "Codelabs",
            url = "https://developer.android.com/codelabs/basic-android-kotlin-compose-activity-lifecycle?hl=en"
        ),
        GridItem(
            title = "Introduction to Coroutines in Kotlin Playground",
            desc = "Practice coroutines in Kotlin Playground for asynchronous programming basics.",
            category = "Codelabs",
            url = "https://developer.android.com/codelabs/basic-android-kotlin-compose-coroutines-kotlin-playground?hl=en"
        ),
        GridItem(
            title = "Introduction to Coroutines in Android Studio",
            desc = "Use coroutines for asynchronous operations in Android, including testing and integration with Compose.",
            category = "Codelabs",
            url = "https://developer.android.com/codelabs/basic-android-kotlin-compose-coroutines-android-studio?hl=en"
        ),
        GridItem(
            title = "Persist data with Room",
            desc = "Set up Room database for local persistence, defining entities, DAOs, and databases in Compose apps.",
            category = "Codelabs",
            url = "https://developer.android.com/codelabs/basic-android-kotlin-compose-persisting-data-room?hl=en"
        ),
        GridItem(
            title = "Read and update data with Room",
            desc = "Perform CRUD operations with Room, querying and modifying data in your Compose app's database.",
            category = "Codelabs",
            url = "https://developer.android.com/codelabs/basic-android-kotlin-compose-update-data-room?hl=en"
        ),
        GridItem(
            title = "Get data from the internet",
            desc = "Fetch and display network data in Compose using Retrofit and coroutines, handling errors gracefully.",
            category = "Codelabs",
            url = "https://developer.android.com/codelabs/basic-android-kotlin-compose-getting-data-internet?hl=en"
        ),
        GridItem(
            title = "Add repository and Manual DI",
            desc = "Improve app architecture by adding repositories and manual dependency injection for better separation of concerns.",
            category = "Codelabs",
            url = "https://developer.android.com/codelabs/basic-android-kotlin-compose-add-repository?hl=en"
        ),
        GridItem(
            title = "Build an Android app with Firebase and Jetpack Compose",
            desc = "Create a to-do list app using Firebase for authentication, performance monitoring, and feature flagging, all integrated with Jetpack Compose for a modern UI.",
            category = "Codelabs",
            url = "https://firebase.google.com/codelabs/build-android-app-with-firebase-compose?hl=en"
        ),
        GridItem(
            title = "Build a Fast Checkout Experience on Android with Google Pay",
            desc = "Integrate Google Pay API into your app for seamless payments, using client libraries to enhance checkout flows in a simplified e-commerce scenario.",
            category = "Codelabs",
            url = "https://developer.android.com/codelabs/pay-android-checkout?hl=en"
        ),
        GridItem(
            title = "Add a map to your Android app (Kotlin with Compose)",
            desc = "Integrate Maps SDK for Android to display interactive maps, add markers, and draw shapes in a Compose-based app.",
            category = "Codelabs",
            url = "https://developers.google.com/codelabs/maps-platform/maps-platform-101-compose?hl=en"
        ),
        GridItem(
            title = "Drag and Drop in Compose",
            desc = "Enable drag-and-drop functionality in your Compose app using modifiers to create sources and targets for data transfer.",
            category = "Codelabs",
            url = "https://developer.android.com/codelabs/codelab-dnd-compose?hl=en"
        ),
        GridItem(
            title = "Build adaptive apps with Jetpack Compose",
            desc = "Create apps that adapt to phones, tablets, and foldables using Material 3 components, focusing on reachability and canonical layouts.",
            category = "Codelabs",
            url = "https://codelabs.developers.google.com/jetpack-compose-adaptability?hl=en"
        ),
        GridItem(
            title = "Build an app with an adaptive layout",
            desc = "Adapt your app for large screens using canonical patterns like list-detail views in Compose.",
            category = "Codelabs",
            url = "https://developer.android.com/codelabs/basic-android-kotlin-compose-adaptive-content-for-large-screens?hl=en"
        ),
        GridItem(
            title = "Build an adaptive app with dynamic navigation",
            desc = "Implement navigation that adapts to screen sizes, using bottom bars on small screens and rails on large ones.",
            category = "Codelabs",
            url = "https://developer.android.com/codelabs/basic-android-kotlin-compose-adaptive-navigation-for-large-screens?hl=en"
        ),
        GridItem(
            title = "Add Compose to a View-based app",
            desc = "Incorporate Compose into existing View-based apps, migrating UI components while maintaining compatibility.",
            category = "Codelabs",
            url = "https://developer.android.com/codelabs/basic-android-kotlin-training-compose-add-compose-to-a-view-based-app?hl=en"
        ),
        GridItem(
            title = "Add adaptive layouts to a view-based Android app with Compose",
            desc = "Incorporate adaptive Compose layouts into existing View-based apps for better large-screen support.",
            category = "Codelabs",
            url = "https://developer.android.com/codelabs/add-adaptive-layouts?hl=en"
        ),
        GridItem(
            title = "Migration codelab",
            desc = "Understand how Jetpack Compose and View-based UIs can co-exist and interact, making it easy to adopt Compose at your own pace.",
            category = "Codelabs",
            url = "https://developer.android.com/codelabs/jetpack-compose-migration"
        ),
        GridItem(
            title = "Compose for Wear OS Codelab",
            desc = "Translate Compose skills to wearables with Compose for Wear OS and Material 3 components. Build simple and advanced composables for wrist-worn apps.",
            category = "Codelabs",
            url = "https://developer.android.com/codelabs/compose-for-wear-os?hl=en"
        ),
        GridItem(
            title = "Introduction to Compose for TV",
            desc = "Build TV app screens with Compose for TV, creating catalog browsers and detail views optimized for large screens and remote controls.",
            category = "Codelabs",
            url = "https://developer.android.com/codelabs/compose-for-tv-introduction?hl=en"
        ),
        GridItem(
            title = "Accessibility codelab",
            desc = "Learn how to improve an app’s accessibility: increase touch targets, add content descriptions, create custom actions, and more.",
            category = "Codelabs",
            url = "https://developer.android.com/codelabs/jetpack-compose-accessibility"
        ),
        GridItem(
            title = "Keyboard focus management in Compose",
            desc = "Implement keyboard navigation in your Compose UI, including focus requesters, custom focus order, and handling input devices for better accessibility on large screens and desktops.",
            category = "Codelabs",
            url = "https://developer.android.com/codelabs/large-screens/keyboard-focus-management-in-compose?hl=en"
        ),
        GridItem(
            title = "Add keyboard, mouse, trackpad, and stylus support with Jetpack Compose",
            desc = "Support input devices in Compose by handling hover states, keyboard shortcuts, and pointer events for enhanced desktop and large-screen experiences.",
            category = "Codelabs",
            url = "https://developer.android.com/codelabs/large-screens/add-keyboard-and-mouse-support-with-compose?hl=en"
        ),
        GridItem(
            title = "Background Work with WorkManager",
            desc = "Schedule and manage background tasks using WorkManager, including chains and constraints for reliable execution.",
            category = "Codelabs",
            url = "https://developer.android.com/codelabs/basic-android-kotlin-compose-workmanager?hl=en"
        ),
        GridItem(
            title = "Android App Resizing",
            desc = "Optimize apps for free-form resizing with manifest settings and continuity handling in Compose.",
            category = "Codelabs",
            url = "https://codelabs.developers.google.com/codelabs/android-resizing?hl=en"
        ),
        GridItem(
            title = "Generics, objects, and extensions",
            desc = "Explore advanced Kotlin features like generics, enums, data classes, and scope functions for Compose development.",
            category = "Codelabs",
            url = "https://developer.android.com/codelabs/basic-android-kotlin-compose-generics?hl=en"
        ),
        GridItem(
            title = "Test the Cupcake App",
            desc = "Write UI tests for the Cupcake app, covering navigation flows and user interactions in Compose.",
            category = "Codelabs",
            url = "https://developer.android.com/codelabs/basic-android-kotlin-compose-test-cupcake?hl=en"
        ),
        GridItem(
            title = "Write unit tests for ViewModel",
            desc = "Test ViewModels in isolation to verify logic, state management, and interactions with repositories.",
            category = "Codelabs",
            url = "https://developer.android.com/codelabs/basic-android-kotlin-compose-test-viewmodel?hl=en"
        ),
        GridItem(
            title = "Testing in Jetpack Compose",
            desc = "Write UI tests for Compose, focusing on isolation, semantics, and synchronization for reliable verification.",
            category = "Codelabs",
            url = "https://developer.android.com/codelabs/jetpack-compose-testing"
        ),
        GridItem(
            title = "Performance codelab",
            desc = "Learn how to measure, investigate and improve the runtime performance of a Compose app.",
            category = "Codelabs",
            url = "https://developer.android.com/codelabs/jetpack-compose-performance"
        ),
        GridItem(
            title = "Get Started With Kotlin Multiplatform",
            desc = "Begin sharing code between Android and iOS with Kotlin Multiplatform. Learn project setup, adding shared modules, and writing platform-specific code.",
            category = "Codelabs",
            url = "https://developer.android.com/codelabs/kmp-get-started?hl=en"
        ),
        GridItem(
            title = "Migrate existing apps to Room KMP",
            desc = "Share your app's database logic across Android and iOS using Room with Kotlin Multiplatform. This codelab covers migration steps, setting up shared modules, and integrating with existing iOS Core Data setups for seamless cross-platform data handling.",
            category = "Codelabs",
            url = "https://developer.android.com/codelabs/kmp-migrate-room?hl=en"
        ),
        GridItem(
            title = "Learn Android XR Fundamentals: Part 1 - Modes and Spatial Panels",
            desc = "Explore the basics of Android XR, including Home Space and Full Space modes, and how to use spatial panels for immersive experiences. This codelab guides you through adapting apps for XR headsets using Jetpack Compose XR library.",
            category = "Codelabs",
            url = "https://developer.android.com/codelabs/xr-fundamentals-part-1?hl=en"
        ),
        GridItem(
            title = "XR Fundamentals",
            desc = "Learn Android XR Fundamentals:Part 2 - Orbiters and Spatial Environments.",
            category = "Codelabs",
            url = "https://developer.android.com/codelabs/xr-fundamentals-part-2"
        ),
        GridItem(
            title = "Buttons",
            desc = "Buttons prompt most actions in a UI.\n\n • Actions",
            category = "Material Components",
            url = "https://www.boltuix.com/2025/08/material-3-buttons-in-jetpack-compose_2.html",
            imageUrl = Res.drawable.buttons
        ),
        GridItem(
            title = "Floating Action Button",
            desc = "Floating action buttons (FABs) help users take primary actions.\n\n • Actions",
            category = "Material Components",
            url = "https://www.boltuix.com/2025/08/material-3-floating-action-buttons-in.html",
            imageUrl = Res.drawable.floatingactionbutton
        ),
        GridItem(
            title = "Icon Button",
            desc = "Icon buttons help users take minor actions with one tap.\n\n • Actions",
            category = "Material Components",
            url = "https://www.boltuix.com/2025/08/material-3-icon-buttons-in-jetpack.html",
            imageUrl = Res.drawable.iconbutton
        ),
        GridItem(
            title = "Segmented Button",
            desc = "Segmented buttons help users select options, switch views, or sort elements.\n\n • Actions",
            category = "Material Components",
            url = "https://www.boltuix.com/2025/08/material-3-segmented-buttons-in-jetpack.html",
            imageUrl = Res.drawable.segmentedbutton
        ),
        GridItem(
            title = "Badges",
            desc = "Badges show notifications, counts, or status information on navigation items and icons.\n\n • Communication",
            category = "Material Components",
            url = "https://www.boltuix.com/2025/08/material-3-badges-in-jetpack-compose.html",
            imageUrl = Res.drawable.badges
        ),
        GridItem(
            title = "Progress Indicators",
            desc = "Progress indicators express an unspecified wait time or display the duration of a process.\n\n • Communication",
            category = "Material Components",
            url = "https://www.boltuix.com/2025/08/material-3-progress-indicators-in.html",
            imageUrl = Res.drawable.progressindicators
        ),
        GridItem(
            title = "Snackbar",
            desc = "Snackbars show short updates about app processes at the bottom of the screen.\n\n • Communication",
            category = "Material Components",
            url = "https://www.boltuix.com/2025/08/material-3-snackbars-in-jetpack-compose.html",
            imageUrl = Res.drawable.snackbar
        ),
        GridItem(
            title = "Tooltips",
            desc = "Tooltips display brief labels or messages.\n\n • Communication",
            category = "Material Components",
            url = "https://www.boltuix.com/2025/08/material-3-tooltips-in-jetpack-compose.html",
            imageUrl = Res.drawable.tooltips
        ),
        GridItem(
            title = "Bottom Sheets",
            desc = "Bottom sheets show secondary content anchored to the bottom of the screen.\n\n • Containment",
            category = "Material Components",
            url = "https://www.boltuix.com/2025/08/material-3-bottom-sheets-in-jetpack.html",
            imageUrl = Res.drawable.bottomsheets
        ),
        GridItem(
            title = "Cards",
            desc = "Cards display content and actions about a single subject.\n\n • Containment",
            category = "Material Components",
            url = "https://www.boltuix.com/2025/08/material-3-cards-in-jetpack-compose.html",
            imageUrl = Res.drawable.cards
        ),
        GridItem(
            title = "Carousel",
            desc = "Carousels show a collection of items that can be scrolled on and off the screen.\n\n • Containment",
            category = "Material Components",
            url = "https://www.boltuix.com/2025/08/material-3-carousels-in-jetpack-compose.html",
            imageUrl = Res.drawable.carousel
        ),
        GridItem(
            title = "Dialogs",
            desc = "Dialogs provide important prompts in a user flow.\n\n • Containment",
            category = "Material Components",
            url = "https://www.boltuix.com/2025/08/material-3-dialogs-in-jetpack-compose.html",
            imageUrl = Res.drawable.dialogs
        ),
        GridItem(
            title = "Dividers",
            desc = "Dividers are thin lines that group content in lists or other containers.\n\n • Containment",
            category = "Material Components",
            url = "https://www.boltuix.com/2025/08/material-3-dividers-in-jetpack-compose.html",
            imageUrl = Res.drawable.dividers
        ),
        GridItem(
            title = "Lists",
            desc = "Lists are continuous, vertical indexes of text and images.\n\n • Containment",
            category = "Material Components",
            url = "https://www.boltuix.com/2025/08/material-3-lists-and-grids-in-jetpack.html",
            imageUrl = Res.drawable.lists
        ),
        GridItem(
            title = "Scaffold",
            desc = "Scaffolds hold together different parts of the UI in complex user interfaces.\n\n • Containment",
            category = "Material Components",
            url = "https://www.boltuix.com/2025/08/material-3-scaffold-in-jetpack-compose.html",
            imageUrl = Res.drawable.scaffold
        ),
        GridItem(
            title = "App Bars",
            desc = "App bars are placed at the top of a screen to help users navigate.\n\n • Navigation",
            category = "Material Components",
            url = "https://www.boltuix.com/2025/08/material-3-app-bars-in-jetpack-compose.html",
            imageUrl = Res.drawable.appbars
        ),
        GridItem(
            title = "Navigation Bar",
            desc = "Navigation bars let people switch between UI views on smaller devices.\n\n • Navigation",
            category = "Material Components",
            url = "https://www.boltuix.com/2025/08/material-3-navigation-bar-in-jetpack.html",
            imageUrl = Res.drawable.navigationbar
        ),
        GridItem(
            title = "Navigation Drawer",
            desc = "Navigation drawers let people switch between UI views on larger devices.\n\n • Navigation",
            category = "Material Components",
            url = "https://www.boltuix.com/2025/08/material-3-navigation-drawer-in-jetpack.html",
            imageUrl = Res.drawable.navigationdrawer
        ),
        GridItem(
            title = "Navigation Rail",
            desc = "Navigation rails let people switch between UI views on mid-size devices.\n\n • Navigation",
            category = "Material Components",
            url = "https://www.boltuix.com/2025/08/material-3-navigation-rail-in-jetpack.html",
            imageUrl = Res.drawable.navigationrail
        ),
        GridItem(
            title = "Tabs",
            desc = "Tabs organize content across different screens and views.\n\n • Navigation",
            category = "Material Components",
            url = "https://www.boltuix.com/2025/08/material-3-tabs-in-jetpack-compose.html",
            imageUrl = Res.drawable.tabs
        ),
        GridItem(
            title = "Checkbox",
            desc = "Checkboxes let users select one or more items from a list, or turn an item on or off.\n\n • Selection",
            category = "Material Components",
            url = "https://www.boltuix.com/2025/08/material-3-checkboxes-in-jetpack-compose.html",
            imageUrl = Res.drawable.checkbox
        ),
        GridItem(
            title = "Chips",
            desc = "Chips help people enter information, make selections, filter content, or trigger actions.\n\n • Selection",
            category = "Material Components",
            url = "https://www.boltuix.com/2025/08/material-3-chips-in-jetpack-compose.html",
            imageUrl = Res.drawable.chips
        ),
        GridItem(
            title = "Date Picker",
            desc = "Date pickers let people select a date, or a range of dates.\n\n • Selection",
            category = "Material Components",
            url = "https://www.boltuix.com/2025/08/material-3-date-pickers-in-jetpack.html",
            imageUrl = Res.drawable.datepicker
        ),
        GridItem(
            title = "Menus",
            desc = "Menus display a list of choices on a temporary surface.\n\n • Selection",
            category = "Material Components",
            url = "https://www.boltuix.com/2025/08/material-3-drop-down-menus-in-jetpack.html",
            imageUrl = Res.drawable.menus
        ),
        GridItem(
            title = "Radio Button",
            desc = "Radio buttons let people select one option from a set of options.\n\n • Selection",
            category = "Material Components",
            url = "https://www.boltuix.com/2025/08/material-3-radio-buttons-in-jetpack.html",
            imageUrl = Res.drawable.radiobutton
        ),
        GridItem(
            title = "Sliders",
            desc = "Sliders let users make selections from a range of values.\n\n • Selection",
            category = "Material Components",
            url = "https://www.boltuix.com/2025/08/material-3-sliders-in-jetpack-compose.html",
            imageUrl = Res.drawable.sliders
        ),
        GridItem(
            title = "Switch",
            desc = "Switches toggle the selection of an item on or off.\n\n • Selection",
            category = "Material Components",
            url = "https://www.boltuix.com/2025/08/material-3-switches-in-jetpack-compose.html",
            imageUrl = Res.drawable.switch
        ),
        GridItem(
            title = "Time Pickers",
            desc = "Time pickers help users select and set a specific time.\n\n • Selection",
            category = "Material Components",
            url = "https://www.boltuix.com/2025/08/material-3-time-pickers-in-jetpack.html",
            imageUrl = Res.drawable.timepickers
        ),
        GridItem(
            title = "Search",
            desc = "Search lets users enter a keyword or phrase to get relevant information.\n\n • Text Inputs",
            category = "Material Components",
            url = "https://www.boltuix.com/2025/08/material-3-search-bars-in-jetpack.html",
            imageUrl = Res.drawable.search
        ),
        GridItem(
            title = "Text Fields",
            desc = "Text fields let users enter text into a UI.\n\n • Text Inputs",
            category = "Material Components",
            url = "https://www.boltuix.com/2025/08/material-3-text-fields-in-jetpack.html",
            imageUrl = Res.drawable.textfields
        ),
        GridItem(
            title = "Compose 1.9 Release",
            desc = "Discover what’s new and improved in Jetpack Compose 1.9.",
            category = "Tips",
            url = "https://www.boltuix.com/2025/08/what-is-new-in-jetpack-compose-compose.html",
        ),
        GridItem(
            title = "Material Theme Builder",
            desc = "Dynamic Color, Compose & XML Export for Material 3",
            category = "Tips",
            url = "https://material-foundation.github.io/material-theme-builder/",
        ),
        GridItem(
            title = "Hilt Cheat Sheet",
            desc = "This cheat sheet gives you a quick & simple reference for the most useful Hilt and Dagger annotations",
            category = "Tips",
            url = "https://developer.android.com/static/images/training/dependency-injection/hilt-annotations.pdf",
        ),
        GridItem(
            title = "Animation Cheat Sheet",
            desc = "If you are working with Jetpack Compose animations and want a quick, visual guide to the most useful APIs, this cheat sheet is for you.",
            category = "Tips",
            url = "https://storage.googleapis.com/android-stories/compose/Compose_Animation_Cheat_Sheet.pdf",
        ),
        GridItem(
            title = "Choose the Right Animation API in Jetpack Compose",
            desc = "Animations can make your app feel smooth and delightful — but with so many APIs in Jetpack Compose, choosing the right one can be confusing.",
            category = "Tips",
            url = "https://developer.android.com/static/develop/ui/compose/images/animations/compose_animation_decision_tree_v2.pdf",
        ),
        GridItem(
            title = "Testing cheatsheet",
            desc = "The Compose testing cheat sheet is a quick reference of some of the most useful Compose test APIs.",
            category = "Tips",
            url = "https://developer.android.com/static/develop/ui/compose/images/compose-testing-cheatsheet.pdf",
        ),
        GridItem(
            title = "Shortcuts PDF",
            desc = "Knowing these shortcuts can save you a ton of time & make you feel like a pro.",
            category = "Tips",
            url = "https://resources.jetbrains.com/storage/products/intellij-idea/docs/IntelliJIDEA_ReferenceCard.pdf",
        ),
        GridItem(
            title = "Compose Tips & Tricks",
            desc = "Explore tips and tricks that will help you master Jetpack Compose and elevate your Android UI development skills.",
            category = "Tips",
            url = "https://www.reddit.com/r/JetpackComposeDev/?f=flair_name%3A%22Tips%20%26%20Tricks%22",
        ),

        GridItem(
            title = "Kotlin Playground",
            desc = "Explore Kotlin and practice your coding skills on the Kotlin Playground! Simply type a snippet of code and click Run to try it on the fly.",
            category = "Tips",
            url = "https://play.kotlinlang.org/",
        ),

        GridItem(
            title = "Jetpack Compose Dev",
            desc = "Your space to learn, share, and master modern Android UI with Jetpack Compose, Kotlin, and KMP. Ask questions, showcase your UI, explore tutorials, share tips, get feedback, and connect with developers building the future of Android and cross-platform apps. Whether you're a beginner or experienced, join us in advancing Compose and Kotlin Multiplatform together.",
            category = "Tips",
            url = "https://www.reddit.com/r/JetpackComposeDev/",
            imageUrl = Res.drawable.jetpackcomposedev
        ),
        GridItem(
            title = "Compose layout basics",
            desc = "Learn the simple building blocks of Jetpack Compose, like how to arrange UI elements using rows, columns, and boxes. This is a great starting point for beginners to understand how Compose turns ideas into on-screen designs. You'll see how easy it is to create basic screens without complex code.",
            category = "Compose Layouts",
            url = "https://developer.android.com/develop/ui/compose/layouts அbasics"
        ),
        GridItem(
            title = "Compose modifiers",
            desc = "Modifiers are easy tools to change how your UI elements look and behave, like adding padding, colors, or making them clickable. Start here to customize basic layouts without complicated code.",
            category = "Compose Layouts",
            url = "https://developer.android.com/develop/ui/compose/modifiers"
        ),
        GridItem(
            title = "Display a finite scrollable list",
            desc = "Make a simple list that users can scroll through, like a menu or short list of items. Use easy modifiers to add scrolling to rows or columns. This helps when your content is longer than the screen, keeping things smooth and user-friendly.",
            category = "Quick Guides",
            url = "https://developer.android.com/develop/ui/compose/quick-guides/content/finite-scrolling-list?hl=en"
        ),
        GridItem(
            title = "Create a button",
            desc = "Add a basic button that users can tap to do something, like submit a form. This is one of the simplest interactive elements to start with.",
            category = "Quick Guides",
            url = "https://developer.android.com/develop/ui/compose/quick-guides/content/create-button?hl=en"
        ),
        GridItem(
            title = "Style parts of text",
            desc = "Change colors or fonts for specific words in a sentence to make text more interesting and easy to read. You can highlight important parts or add links. It's a quick way to make your app's text pop and guide users' attention.",
            category = "Quick Guides",
            url = "https://developer.android.com/develop/ui/compose/quick-guides/content/style-parts-text?hl=en"
        ),
        GridItem(
            title = "Load and display images",
            desc = "Add pictures to your app from your device or the internet, and show them on the screen simply.",
            category = "Quick Guides",
            url = "https://developer.android.com/develop/ui/compose/quick-guides/content/load-images?hl=en"
        ),
        GridItem(
            title = "Display an animated image",
            desc = "Show moving pictures like GIFs to make your app more fun, such as loading animations or icons. This adds life to your UI without much effort. Users love seeing dynamic elements that respond to actions.",
            category = "Quick Guides",
            url = "https://developer.android.com/develop/ui/compose/quick-guides/content/display-animated-image?hl=en"
        ),
        GridItem(
            title = "Animate character-by-character the appearance of text",
            desc = "Make text appear one letter at a time, like typing, to create a cool effect for messages.",
            category = "Quick Guides",
            url = "https://developer.android.com/develop/ui/compose/quick-guides/content/animate-text?hl=en"
        ),
        GridItem(
            title = "Build a list using multiple item types",
            desc = "Create lists with different kinds of items, like text and images mixed together. This is useful for feeds or menus with variety. It helps organize information in a visually appealing way for beginners.",
            category = "Quick Guides",
            url = "https://developer.android.com/develop/ui/compose/quick-guides/content/build-list-multiple-item-types?hl=en"
        ),
        GridItem(
            title = "Create a scrollable grid",
            desc = "Make a grid of items that users can scroll through, great for showing lots of pictures or buttons.",
            category = "Quick Guides",
            url = "https://developer.android.com/develop/ui/compose/quick-guides/content/create-scrollable-grid?hl=en"
        ),
        GridItem(
            title = "Lazily load data with lists and Paging",
            desc = "Load big lists a little at a time so your app stays fast, like showing more items as you scroll. This prevents slowdowns with large data. It's essential for apps with lots of content.",
            category = "Quick Guides",
            url = "https://developer.android.com/develop/ui/compose/quick-guides/content/lazily-load-list?hl=en"
        ),
        GridItem(
            title = "Display a paging list",
            desc = "Create lists where users swipe through pages of items, like photo galleries or articles.",
            category = "Quick Guides",
            url = "https://developer.android.com/develop/ui/compose/quick-guides/content/display-paging-list?hl=en"
        ),
        GridItem(
            title = "Display nested scrolling items in a list",
            desc = "Put scrollable sections inside a bigger scrolling list, like mini galleries in a news feed. This creates rich, interactive content. Beginners can use it to build complex UIs step by step.",
            category = "Quick Guides",
            url = "https://developer.android.com/develop/ui/compose/quick-guides/content/display-nested-list?hl=en"
        ),
        GridItem(
            title = "Filter a list while typing",
            desc = "Let users type to search and show only matching items in a list, like a simple search bar.",
            category = "Quick Guides",
            url = "https://developer.android.com/develop/ui/compose/quick-guides/content/filter-list-while-typing?hl=en"
        ),
        GridItem(
            title = "Create a button to enable snap scrolling",
            desc = "Add a button that jumps the list to a specific spot, making navigation quicker. It's handy for long lists. Users appreciate quick access to sections.",
            category = "Quick Guides",
            url = "https://developer.android.com/develop/ui/compose/quick-guides/content/enable-snap-scrolling?hl=en"
        ),
        GridItem(
            title = "Add a custom page indicator",
            desc = "Show dots or numbers to tell users where they are in a list of pages, like slideshow progress.",
            category = "Quick Guides",
            url = "https://developer.android.com/develop/ui/compose/quick-guides/content/custom-page-indicator?hl=en"
        ),
        GridItem(
            title = "Create a progress indicator",
            desc = "Show a bar or spinner to indicate loading or progress, like when waiting for data. This keeps users informed. It's a must for apps with delays.",
            category = "Quick Guides",
            url = "https://developer.android.com/develop/ui/compose/quick-guides/content/create-progress-indicator?hl=en"
        ),
        GridItem(
            title = "Create a slider for a range of values",
            desc = "Let users pick a number from a range by sliding a bar, like setting volume.",
            category = "Quick Guides",
            url = "https://developer.android.com/develop/ui/compose/quick-guides/content/create-range-slider?hl=en"
        ),
        GridItem(
            title = "Add a switch that users can toggle",
            desc = "Add an on/off switch for simple choices, like turning on dark mode. Easy to implement and understand. Great for settings screens.",
            category = "Quick Guides",
            url = "https://developer.android.com/develop/ui/compose/quick-guides/content/add-toggle-switch?hl=en"
        ),
        GridItem(
            title = "Create a chip to represent complex entities",
            desc = "Use small tags with icons and text to show items like contacts or filters.",
            category = "Quick Guides",
            url = "https://developer.android.com/develop/ui/compose/quick-guides/content/create-chip?hl=en"
        ),
        GridItem(
            title = "Auto-format a phone number in a text field",
            desc = "Automatically add dashes or spaces as users type a phone number. This makes input easier and reduces errors. Ideal for forms.",
            category = "Quick Guides",
            url = "https://developer.android.com/develop/ui/compose/quick-guides/content/auto-format-phone-number?hl=en"
        ),
        GridItem(
            title = "Validate input as the user types",
            desc = "Check if what users type is correct right away, like a valid email.",
            category = "Quick Guides",
            url = "https://developer.android.com/develop/ui/compose/quick-guides/content/validate-input?hl=en"
        ),
        GridItem(
            title = "Show or hide password based on a user toggle",
            desc = "Let users tap an eye icon to see or hide their password while typing. Enhances security and usability. Simple to add to login forms.",
            category = "Quick Guides",
            url = "https://developer.android.com/develop/ui/compose/quick-guides/content/show-hide-password?hl=en"
        ),
        GridItem(
            title = "Support multiple links in a single string of text",
            desc = "Make words in text clickable to open different websites or actions.",
            category = "Quick Guides",
            url = "https://developer.android.com/develop/ui/compose/quick-guides/content/support-multiple-links?hl=en"
        ),
        GridItem(
            title = "Display pop-up messages or requests for user input",
            desc = "Show a small window for alerts or asking questions, like confirm delete. Useful for confirmations. Keeps UI clean and focused.",
            category = "Quick Guides",
            url = "https://developer.android.com/develop/ui/compose/quick-guides/content/display-user-input?hl=en"
        ),
        GridItem(
            title = "Create a notification with a snackbar",
            desc = "Show a quick message at the bottom of the screen, like 'Saved!'.",
            category = "Quick Guides",
            url = "https://developer.android.com/develop/ui/compose/quick-guides/content/create-snackbar-notification?hl=en"
        ),
        GridItem(
            title = "Create a card as a container",
            desc = "Use a card to group related info, like a profile or product details. Adds a nice shadow effect. Perfect for lists of items.",
            category = "Quick Guides",
            url = "https://developer.android.com/develop/ui/compose/quick-guides/content/create-card-as-container?hl=en"
        ),
        GridItem(
            title = "Create a floating action button (FAB)",
            desc = "Add a round button that floats on the screen for main actions, like 'Add'.",
            category = "Quick Guides",
            url = "https://developer.android.com/develop/ui/compose/quick-guides/content/create-floating-action-button?hl=en"
        ),
        GridItem(
            title = "Display an app bar",
            desc = "Add a bar at the top or bottom with title, menu, or navigation buttons. Essential for app navigation. Customizable for your theme.",
            category = "Quick Guides",
            url = "https://developer.android.com/develop/ui/compose/quick-guides/content/display-app-bar?hl=en"
        ),
        GridItem(
            title = "Display a top app bar",
            desc = "Create a bar at the top for app name, back button, or actions.",
            category = "Quick Guides",
            url = "https://developer.android.com/develop/ui/compose/quick-guides/content/display-top-app-bar?hl=en"
        ),
        GridItem(
            title = "Display a bottom app bar",
            desc = "Add a bar at the bottom for quick access to main features. Good for mobile apps. Integrates with floating buttons.",
            category = "Quick Guides",
            url = "https://developer.android.com/develop/ui/compose/quick-guides/content/display-bottom-app-bar?hl=en"
        ),
        GridItem(
            title = "Create a slide-in menu with the navigation drawer component",
            desc = "Add a menu that slides in from the side for navigation options.",
            category = "Quick Guides",
            url = "https://developer.android.com/develop/ui/compose/quick-guides/content/create-navigation-drawer?hl=en"
        ),
        GridItem(
            title = "Create a bottom sheet",
            desc = "Show extra info or options sliding up from the bottom of the screen. Useful for temporary menus. Dismisses easily.",
            category = "Quick Guides",
            url = "https://developer.android.com/develop/ui/compose/quick-guides/content/create-bottom-sheet?hl=en"
        ),
        GridItem(
            title = "Create a scaffold component to hold the UI together",
            desc = "Use a scaffold to organize your screen with app bar, menu, and main content.",
            category = "Quick Guides",
            url = "https://developer.android.com/develop/ui/compose/quick-guides/content/create-scaffold?hl=en"
        ),
        GridItem(
            title = "State in Compose",
            desc = "Understand how data changes update your UI automatically in Compose. Learn to manage simple states like button clicks or text changes. This is key for interactive apps.",
            category = "Quick Guides",
            url = "https://developer.android.com/develop/ui/compose/quick-guides/content/video/state-in-compose?hl=en"
        ),
        GridItem(
            title = "Constraints and modifier order",
            desc = "Learn how the order of modifiers affects size and position of UI elements.",
            category = "Compose Layouts",
            url = "https://developer.android.com/develop/ui/compose/layouts/constraints-modifiers"
        ),
        GridItem(
            title = "Flow layouts in Compose",
            desc = "Create flexible rows or columns that wrap items to the next line automatically. Ideal for tags or buttons. Adjusts to screen size.",
            category = "Compose Layouts",
            url = "https://developer.android.com/develop/ui/compose/layouts/flow"
        ),
        GridItem(
            title = "Pager in Compose",
            desc = "Add swipeable pages for content like image galleries or onboarding screens.",
            category = "Compose Layouts",
            url = "https://developer.android.com/develop/ui/compose/layouts/pager"
        ),
        GridItem(
            title = "Custom layouts",
            desc = "Build your own unique way to arrange UI elements on the screen. For when built-in options aren't enough. Gives full control.",
            category = "Compose Layouts",
            url = "https://developer.android.com/develop/ui/compose/layouts/custom"
        ),
        GridItem(
            title = "Alignment lines in Jetpack Compose",
            desc = "Use special lines to perfectly align UI elements in custom ways.",
            category = "Compose Layouts",
            url = "https://developer.android.com/develop/ui/compose/layouts/alignment-lines"
        ),
        GridItem(
            title = "Intrinsic measurements in Compose layouts",
            desc = "Figure out sizes of elements before fully drawing them for smarter layouts. Helps with dynamic content. Advanced but useful.",
            category = "Compose Layouts",
            url = "https://developer.android.com/develop/ui/compose/layouts/intrinsic-measurements"
        ),
        GridItem(
            title = "ConstraintLayout in Compose",
            desc = "Position elements relative to each other for complex screen designs.",
            category = "Compose Layouts",
            url = "https://developer.android.com/develop/ui/compose/layouts/constraintlayout"
        ),
        GridItem(
            title = "Lazy lists in Compose",
            desc = "Create efficient scrolling lists that load items as needed for better performance. Handles large data sets smoothly. A step up from basic lists.",
            category = "Quick Guides",
            url = "https://developer.android.com/develop/ui/compose/quick-guides/content/video/lazy-lists-compose?hl=en"
        ),
        GridItem(
            title = "Lists in Compose",
            desc = "Learn to make lists with different items and sticky headers for organized content.",
            category = "Quick Guides",
            url = "https://developer.android.com/develop/ui/compose/quick-guides/content/video/lists-in-compose?hl=en"
        ),
        GridItem(
            title = "Insets in Compose",
            desc = "Make your app fit around system bars like status or navigation without overlapping.",
            category = "Quick Guides",
            url = "https://developer.android.com/develop/ui/compose/quick-guides/content/video/insets-in-compose?hl=en"
        ),
        GridItem(
            title = "Accessibility in Compose",
            desc = "Add features like screen reader support to make your app usable for everyone.",
            category = "Quick Guides",
            url = "https://developer.android.com/develop/ui/compose/quick-guides/content/video/accessibility-in-compose?hl=en"
        ),
        GridItem(
            title = "Advanced layouts in Compose",
            desc = "Build more complex designs using measurements and custom positioning. Dive deeper into layoutV. Tackle advanced topics for when you're ready.",
            category = "Quick Guides",
            url = "https://developer.android.com/develop/ui/compose/quick-guides/content/video/advanced-layouts-compose?hl=en"
        ),
        GridItem(
            title = "Intro to drawing in Compose",
            desc = "Start drawing your own shapes and custom graphics on the screen. For unique visual effects. Expands your design options.",
            category = "Quick Guides",
            url = "https://developer.android.com/develop/ui/compose/quick-guides/content/video/drawing-in-compose?hl=en"
        ),
        GridItem(
            title = "Draw text in Compose",
            desc = "Learn to draw words and emojis directly on a canvas for custom looks.",
            category = "Quick Guides",
            url = "https://developer.android.com/develop/ui/compose/quick-guides/content/video/draw-text-compose?hl=en"
        ),
        GridItem(
            title = "Display layered images on a canvas",
            desc = "Stack and blend pictures on top of each other for cool effects. Create composite images. Fun for photo editors.",
            category = "Quick Guides",
            url = "https://developer.android.com/develop/ui/compose/quick-guides/content/display-layered-image?hl=en"
        ),
        GridItem(
            title = "Display an image clipped to a shape",
            desc = "Cut a picture into a circle or other shape with shadows around it.",
            category = "Quick Guides",
            url = "https://developer.android.com/develop/ui/compose/quick-guides/content/clipped-image?hl=en"
        ),
        GridItem(
            title = "Create a parallax scrolling effect",
            desc = "Make background and foreground move at different speeds for a 3D feel. Adds depth to scrolls. Impresses users easily.",
            category = "Quick Guides",
            url = "https://developer.android.com/develop/ui/compose/quick-guides/content/parallax-scrolling?hl=en"
        ),
        GridItem(
            title = "Animation in Compose",
            desc = "Add smooth movements to change sizes, colors, or visibility of elements.",
            category = "Quick Guides",
            url = "https://developer.android.com/develop/ui/compose/quick-guides/content/video/animation-in-compose?hl=en"
        ),
        GridItem(
            title = "Five quick animations in Compose",
            desc = "Try five easy ways to add fun movements to make your app feel alive. Quick to implement. Boosts user engagement.",
            category = "Quick Guides",
            url = "https://developer.android.com/develop/ui/compose/quick-guides/content/video/five-animations-compose?hl=en"
        ),
        GridItem(
            title = "Debugging recomposition in Compose",
            desc = "Find and fix why your UI redraws too often to make your app faster.",
            category = "Quick Guides",
            url = "https://developer.android.com/develop/ui/compose/quick-guides/content/video/debugging-recomposition?hl=en"
        ),
        GridItem(
            title = "Testing in Compose",
            desc = "Write simple tests to check if your UI works as expected. Catches bugs early. Ensures reliability.",
            category = "Quick Guides",
            url = "https://developer.android.com/develop/ui/compose/quick-guides/content/video/testing-in-compose?hl=en"
        ),
        GridItem(
            title = "Compose layout basics",
            desc = "Learn the simple building blocks of Jetpack Compose, like how to arrange UI elements using rows, columns, and boxes. This is a great starting point for beginners to understand how Compose turns ideas into on-screen designs.",
            category = "Compose Layouts",
            url = "https://developer.android.com/develop/ui/compose/layouts/basics"
        ),
        GridItem(
            title = "Compose modifiers",
            desc = "Modifiers are easy tools to change how your UI elements look and behave, like adding padding, colors, or making them clickable. Start here to customize basic layouts without complicated code.",
            category = "Compose Layouts",
            url = "https://developer.android.com/develop/ui/compose/modifiers"
        ),
        GridItem(
            title = "State and Jetpack Compose",
            desc = "Understand how data changes update your UI automatically in Compose. Learn to manage simple states like button clicks or text changes. This is key for interactive apps.",
            category = "Compose State",
            url = "https://developer.android.com/develop/ui/compose/state"
        ),
        GridItem(
            title = "Kotlin for Jetpack Compose",
            desc = "Discover how Kotlin features make Compose easier, like using special functions for state and effects.",
            category = "Compose Basics",
            url = "https://developer.android.com/develop/ui/compose/kotlin"
        ),
        GridItem(
            title = "Jetpack Compose phases",
            desc = "Learn the three steps Compose uses to build and update your UI: deciding what to show, where to place it, and how to draw it. Understanding this helps optimize performance. It's fundamental for efficient apps.",
            category = "Compose Basics",
            url = "https://developer.android.com/develop/ui/compose/phases"
        ),
        GridItem(
            title = "Display text",
            desc = "Show words on the screen and make them look nice with colors, sizes, and styles. Perfect for beginners adding labels or messages.",
            category = "Compose Text",
            url = "https://developer.android.com/develop/ui/compose/text/display-text"
        ),
        GridItem(
            title = "Style text",
            desc = "Change how text looks with bold, italics, colors, or fonts to make it stand out. Experiment with sizes. Matches your app's theme.",
            category = "Compose Text",
            url = "https://developer.android.com/develop/ui/compose/text/style-text"
        ),
        GridItem(
            title = "Style paragraph",
            desc = "Adjust how paragraphs align, space out lines, or indent text for better reading.",
            category = "Compose Text",
            url = "https://developer.android.com/develop/ui/compose/text/style-paragraph"
        ),
        GridItem(
            title = "Configure text layout",
            desc = "Set limits like maximum lines or how text overflows if it's too long. Controls appearance. Prevents messy layouts.",
            category = "Compose Text",
            url = "https://developer.android.com/develop/ui/compose/text/configure-layout"
        ),
        GridItem(
            title = "Configure text fields",
            desc = "Create boxes where users can type text, with options for passwords or numbers.",
            category = "Compose Text",
            url = "https://developer.android.com/develop/ui/compose/text/user-input?textfield=state-based"
        ),
        GridItem(
            title = "Enable user interactions",
            desc = "Let users select, copy, or click links in text for more interactive apps. Enhances usability. Supports accessibility.",
            category = "Compose Text",
            url = "https://developer.android.com/develop/ui/compose/text/user-interactions"
        ),
        GridItem(
            title = "Work with fonts",
            desc = "Choose different fonts or styles to make text match your app's look.",
            category = "Compose Text",
            url = "https://developer.android.com/develop/ui/compose/text/fonts"
        ),
        GridItem(
            title = "Autofill in Compose",
            desc = "Let the system automatically fill in forms like emails or passwords. Saves time. Improves user experience.",
            category = "Compose Text",
            url = "https://developer.android.com/develop/ui/compose/text/autofill"
        ),
        GridItem(
            title = "Customize an image",
            desc = "Change how pictures look with scaling, filters, or tints.",
            category = "Compose Graphics",
            url = "https://developer.android.com/develop/ui/compose/graphics/images/customize"
        ),
        GridItem(
            title = "Graphics in Compose",
            desc = "Draw custom shapes, lines, or images directly on the screen. For creative designs. Unlimited possibilities.",
            category = "Compose Graphics",
            url = "https://developer.android.com/develop/ui/compose/graphics/draw/overview"
        ),
        GridItem(
            title = "Brush: gradients and shaders",
            desc = "Create colorful gradients or patterns to fill shapes.",
            category = "Compose Graphics",
            url = "https://developer.android.com/develop/ui/compose/graphics/draw/brush"
        ),
        GridItem(
            title = "Shapes in Compose",
            desc = "Make custom shapes like circles or polygons for buttons or backgrounds. Easy to clip images. Adds uniqueness.",
            category = "Compose Graphics",
            url = "https://developer.android.com/develop/ui/compose/graphics/draw/shapes"
        ),
        GridItem(
            title = "Constraints and modifier order",
            desc = "Learn how the order of modifiers affects size and position of UI elements.",
            category = "Compose Layouts",
            url = "https://developer.android.com/develop/ui/compose/layouts/constraints-modifiers"
        ),
        GridItem(
            title = "Flow layouts in Compose",
            desc = "Create flexible rows or columns that wrap items to the next line automatically. Adapts to screen. Great for dynamic content.",
            category = "Compose Layouts",
            url = "https://developer.android.com/develop/ui/compose/layouts/flow"
        ),
        GridItem(
            title = "Pager in Compose",
            desc = "Add swipeable pages for content like image galleries or onboarding screens.",
            category = "Compose Layouts",
            url = "https://developer.android.com/develop/ui/compose/layouts/pager"
        ),
        GridItem(
            title = "About window insets",
            desc = "Understand areas on the screen taken by system bars and how to handle them. Avoid overlaps. Ensures full-screen feel.",
            category = "Compose System UI",
            url = "https://developer.android.com/develop/ui/compose/system/insets"
        ),
        GridItem(
            title = "Use keyboard IME animations",
            desc = "Make your UI move smoothly with the keyboard opening or closing.",
            category = "Compose System UI",
            url = "https://developer.android.com/develop/ui/compose/system/keyboard-animations"
        ),
        GridItem(
            title = "Use Material 3 insets",
            desc = "Let Material components automatically adjust for system bars. Simplifies design. Consistent look.",
            category = "Compose System UI",
            url = "https://developer.android.com/develop/ui/compose/system/material-insets"
        ),
        GridItem(
            title = "About system bar protection",
            desc = "Protect your content from overlapping with status or navigation bars.",
            category = "Compose System UI",
            url = "https://developer.android.com/develop/ui/compose/system/system-bars"
        ),
        GridItem(
            title = "About cutouts",
            desc = "Handle screen notches or holes for cameras without covering them. Full edge-to-edge. Modern device support.",
            category = "Compose System UI",
            url = "https://developer.android.com/develop/ui/compose/system/cutouts"
        ),
        GridItem(
            title = "About Predictive back",
            desc = "Show previews when users swipe back for smoother navigation.",
            category = "Compose System UI",
            url = "https://developer.android.com/develop/ui/compose/system/predictive-back"
        ),
        GridItem(
            title = "About picture-in-picture (PiP)",
            desc = "Let your app play video in a small window while using other apps. Multitasking friendly. For video apps.",
            category = "Compose System UI",
            url = "https://developer.android.com/develop/ui/compose/system/picture-in-picture"
        ),
        GridItem(
            title = "Understand gestures",
            desc = "Learn basic touch inputs like taps, swipes, and pinches.",
            category = "Compose Gestures",
            url = "https://developer.android.com/develop/ui/compose/touch-input/pointer-input/understand-gestures"
        ),
        GridItem(
            title = "Tap and press",
            desc = "Handle simple taps or long presses on UI elements. Core interaction. Easy to add feedback.",
            category = "Compose Gestures",
            url = "https://developer.android.com/develop/ui/compose/touch-input/pointer-input/tap-and-press"
        ),
        GridItem(
            title = "Scroll",
            desc = "Add scrolling to lists or long content easily.",
            category = "Compose Gestures",
            url = "https://developer.android.com/develop/ui/compose/touch-input/pointer-input/scroll"
        ),
        GridItem(
            title = "Drag, swipe, and fling",
            desc = "Let users drag items or swipe to dismiss them. Natural gestures. Enhances UX.",
            category = "Compose Gestures",
            url = "https://developer.android.com/develop/ui/compose/touch-input/pointer-input/drag-swipe-fling"
        ),
        GridItem(
            title = "Multitouch: Panning, zooming, rotating",
            desc = "Handle two-finger gestures for maps or images.",
            category = "Compose Gestures",
            url = "https://developer.android.com/develop/ui/compose/touch-input/pointer-input/multi-touch"
        ),
        GridItem(
            title = "Handle keyboard actions",
            desc = "Respond to keys like Enter or shortcuts on physical keyboards. For tablet users. Expands input options.",
            category = "Compose Gestures",
            url = "https://developer.android.com/develop/ui/compose/touch-input/keyboard-input/commands"
        ),
        GridItem(
            title = "Drag and drop",
            desc = "Move items by dragging them to new places.",
            category = "Compose Gestures",
            url = "https://developer.android.com/develop/ui/compose/touch-input/user-interactions/drag-and-drop"
        ),
        GridItem(
            title = "Swipe to dismiss or update",
            desc = "Let users swipe items away or to change them. Like email apps. Intuitive deletion.",
            category = "Compose Gestures",
            url = "https://developer.android.com/develop/ui/compose/touch-input/user-interactions/swipe-to-dismiss"
        ),
        GridItem(
            title = "Stylus input in text fields",
            desc = "Let users write with a stylus directly into text boxes.",
            category = "Compose Gestures",
            url = "https://developer.android.com/develop/ui/compose/touch-input/stylus-input/stylus-input-in-text-fields"
        ),
        GridItem(
            title = "Brush APIs",
            desc = "Create custom brushes for drawing with different styles. For artistic effects. Customizable strokes.",
            category = "Compose Gestures",
            url = "https://developer.android.com/develop/ui/compose/touch-input/stylus-input/ink-api-brush-apis"
        ),
        GridItem(
            title = "Copy and paste",
            desc = "Support copying and pasting text or data in your app.",
            category = "Compose Gestures",
            url = "https://developer.android.com/develop/ui/compose/touch-input/copy-and-paste"
        ),
        GridItem(
            title = "Quick guide to Animations in Compose",
            desc = "Get started with simple animations for common UI changes. From fades to slides. Brings life to apps.",
            category = "Compose Animations",
            url = "https://developer.android.com/develop/ui/compose/animation/quick-guide"
        ),
        GridItem(
            title = "Animation modifiers and composables",
            desc = "Use built-in tools to animate visibility, size, or color changes.",
            category = "Compose Animations",
            url = "https://developer.android.com/develop/ui/compose/animation/composables-modifiers"
        ),
        GridItem(
            title = "Animated vector images in Compose",
            desc = "Play animations from vector files like icons that change shape. Smooth and scalable. For dynamic icons.",
            category = "Compose Animations",
            url = "https://developer.android.com/develop/ui/compose/animation/vectors"
        ),
        GridItem(
            title = "Customize animations",
            desc = "Adjust speed, easing, or timing for your animations.",
            category = "Compose Animations",
            url = "https://developer.android.com/develop/ui/compose/animation/customize"
        ),
        GridItem(
            title = "Shared element transitions in Compose",
            desc = "Smoothly move elements between screens during navigation. Creates seamless flow. Impressive for users.",
            category = "Compose Animations",
            url = "https://developer.android.com/develop/ui/compose/animation/shared-elements"
        ),
        GridItem(
            title = "Customize shared element transition",
            desc = "Change how shared elements move or fade between screens.",
            category = "Compose Animations",
            url = "https://developer.android.com/develop/ui/compose/animation/shared-elements/customize"
        ),
        GridItem(
            title = "Shared elements with Navigation Compose",
            desc = "Use shared transitions with Compose's navigation system. Integrates easily. Enhances app navigation.",
            category = "Compose Animations",
            url = "https://developer.android.com/develop/ui/compose/animation/shared-elements/navigation"
        ),
        GridItem(
            title = "Additional samples",
            desc = "See more examples of animations in action.",
            category = "Compose Animations",
            url = "https://developer.android.com/develop/ui/compose/animation/shared-elements/additional-samples"
        ),
        GridItem(
            title = "Navigation with Compose",
            desc = "Move between different screens in your app smoothly. Handles back stack. Essential for multi-screen apps.",
            category = "Compose Navigation",
            url = "https://developer.android.com/develop/ui/compose/navigation"
        ),
        GridItem(
            title = "App resources overview",
            desc = "Manage images, strings, and other files your app needs.",
            category = "Compose Resources",
            url = "https://developer.android.com/guide/topics/resources/providing-resources"
        ),
        GridItem(
            title = "Preview your UI with composable previews",
            desc = "See how your UI looks without running the app. Fast iteration. Saves development time.",
            category = "Compose Tooling",
            url = "https://developer.android.com/develop/ui/compose/tooling/previews"
        ),
        GridItem(
            title = "Animation Preview",
            desc = "Test and debug animations right in the editor.",
            category = "Compose Tooling",
            url = "https://developer.android.com/develop/ui/compose/tooling/animation-preview"
        ),
        GridItem(
            title = "Editor actions",
            desc = "Use helpful shortcuts in Android Studio for Compose code. Boosts productivity. Quick code generation.",
            category = "Compose Tooling",
            url = "https://developer.android.com/develop/ui/compose/tooling/editor-actions"
        ),
        GridItem(
            title = "Debug your Compose UI",
            desc = "Find and fix issues in your UI layout.",
            category = "Compose Tooling",
            url = "https://developer.android.com/develop/ui/compose/tooling/debug"
        ),
        GridItem(
            title = "Tools for Compose",
            desc = "Explore Android Studio features designed for Compose. From previews to inspectors. Streamlines workflow.",
            category = "Compose Tooling",
            url = "https://developer.android.com/develop/ui/compose/tooling"
        ),
        GridItem(
            title = "Migration strategy",
            desc = "Plan how to switch from old Views to Compose step by step.",
            category = "Compose Migration",
            url = "https://developer.android.com/develop/ui/compose/migrate/strategy"
        ),
        GridItem(
            title = "Test your Compose layout",
            desc = "Write tests to ensure your UI works correctly. Automated checks. Builds confidence.",
            category = "Compose Testing",
            url = "https://developer.android.com/develop/ui/compose/testing"
        ),
        GridItem(
            title = "Semantics",
            desc = "Add meaning to UI elements for better testing and accessibility.",
            category = "Compose Testing",
            url = "https://developer.android.com/develop/ui/compose/testing/semantics"
        ),
        GridItem(
            title = "Performance Follow best practices",
            desc = "Tips to make your app run faster and smoother. Avoid common mistakes. Optimizes battery and speed.",
            category = "Compose Performance",
            url = "https://developer.android.com/develop/ui/compose/performance/bestpractices"
        ),
        GridItem(
            title = "Build UI with Glance",
            desc = "Create simple widget UIs using Compose-like code.",
            category = "Compose Widgets",
            url = "https://developer.android.com/develop/ui/compose/glance/build-ui"
        ),
        GridItem(
            title = "Create an app widget with Glance",
            desc = "Build home screen widgets easily with Glance. Quick setup. Interactive and updatable.",
            category = "Compose Widgets",
            url = "https://developer.android.com/develop/ui/compose/glance/create-app-widget"
        ),
        GridItem(
            title = "Kotlin Complete Language Reference Book",
            desc = "The official reference guide has been updated. This PDF is a complete resource for anyone working with Kotlin, from Android developers to backend engineers.",
            category = "Books",
            url = "https://kotlinlang.org/docs/kotlin-reference.pdf",
            imageUrl = Res.drawable.bookkotlin
        ),
        GridItem(
            title = "Android Mastery Pro - Flipbook",
            desc = "Flipbook style app covers everything from Kotlin basics to advanced Jetpack Compose, clean architecture, and even interview questions - all offline and ad-free!",
            category = "Books",
            url = "https://play.google.com/store/apps/details?id=com.boltuix.androidmasterypro",
            imageUrl = Res.drawable.flipbook
        ),
        GridItem(
            title = "Kotlin Multiplatform Wizard",
            desc = "Create your first multiplatform project using the Kotlin Multiplatform wizard for Android, iOS, and Desktop, or use one of the pre-made templates.",
            category = "KMP",
            url = "https://kmp.jetbrains.com/",
        ),
        GridItem(
            title = "KMP Lib Finder",
            desc = "Create your first multiplatform project using the Kotlin Multiplatform wizard for Android, iOS, and Desktop, or use one of the pre-made templates.",
            category = "KMP",
            url = "https://klibs.io/",
        ),
        GridItem(
            title = "Learn More KMP",
            desc = "Subreddit to discuss topics related to Kotlin Multiplatform (KMP)",
            category = "KMP",
            url = "https://www.reddit.com/r/JetpackComposeDev/?f=flair_name%3A%22KMP%22&feedViewType=cardView",
            imageUrl = Res.drawable.kmp
        ),

        )
}
