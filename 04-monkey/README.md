# Part 4 - Monkey

Monkey is a tool which can run on the device or emulator and creates random streams such as clicks, touches, or gestures, or number of system-level events. 

It is a great tool for stress testing your applications. If the application crashes or receives any exception or ANR, the Monkey will stop and report the error.

Monkey is command line tool. Syntax is following:

```bash
adb shell monkey [options] <event-count>
```

## Code lab

### Open command line and use Monkey tool

Type this into console with your app opened. 

It's better to use app in the emulator because Monkey tool does lots of stuff:

```bash
adb shell monkey -p package_name -v 500
```

So for example for our last app with package net.moudra.testrecorderapp:

```bash
adb shell monkey -p net.moudra.testrecorderapp -v 500
```

For more options type:

```bash
adb shell monkey --help
```

# More resources

* [Monkey](https://developer.android.com/studio/test/monkey.html)
