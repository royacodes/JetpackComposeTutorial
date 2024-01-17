## Compose Tutorial

Use Compose's State and MutableState types to make state observable by Compose.

 You can use the mutableStateOf function to create an observable MutableState. It receives an initial value as a parameter that is wrapped in a State object, which then makes its value observable.

 Compose also has other variants of mutableStateOf, such as mutableIntStateOf, mutableLongStateOf, mutableFloatStateOf, or mutableDoubleStateOf, which are optimized for the primitive types. 

 # Layout Inspector

 Run the app, and open Android Studio's Layout inspector tool by navigating to Tools > Layout Inspector.

 # Compose Architecture Doc

 https://developer.android.com/jetpack/compose/architecture#udf-compose

 ## Note: You might already be using other observable types like LiveData, StateFlow, Flow, and RxJava's Observable to store state in an app. To allow Compose to use this state and automatically recompose when the state changes you need to map them to a State<T>.

## use rememberSaveable instead of remember.

for handling  configuration changes

rememberSaveable automatically saves any value that can be saved in a Bundle. For other values, you can pass in a custom saver object. For more information on Restoring state in Compose, check out the documentation.

https://developer.android.com/jetpack/compose/state#restore-ui-state

## Restore item state in LazyList

 use rememberSaveable
 
 Your state will survive the activity or process recreation using the saved instance state mechanism. 

## There are extension functions designed to do this, so be sure to look them up in the Compose and other libraries' documentation.

https://developer.android.com/jetpack/compose/libraries#streams

https://developer.android.com/topic/libraries/architecture/livedata

https://kotlinlang.org/api/kotlinx.coroutines/kotlinx-coroutines-core/kotlinx.coroutines.flow/-state-flow/

https://kotlinlang.org/api/kotlinx.coroutines/kotlinx-coroutines-core/kotlinx.coroutines.flow/-flow/

https://reactivex.io/documentation/observable.html

# You can learn more about the lifecycle of composables in the documentation.

https://developer.android.com/jetpack/compose/lifecycle#lifecycle-overview

 # Kotlin Delegate Property

 https://kotlinlang.org/docs/delegated-properties.html

 # Kotlin Lambda Function

 
