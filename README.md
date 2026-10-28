# Creative Aquarium

A small Java Swing animation project built to practise object-oriented design,
custom painting, timers, and sprite movement.

![Creative Aquarium preview](https://github.com/user-attachments/assets/c5ca26c7-2439-422e-a0cf-3b9291921c44)

## What it does

- renders a layered underwater scene with Java AWT/Swing;
- animates Gary and a submarine with a Swing `Timer`;
- represents scene elements as separate Java classes;
- supports PNG and GIF assets with transparent layers;
- provides a simple base for experimenting with movement or controls.

This is an educational desktop project rather than a game engine or a
production application.

## Run locally

Requirements: JDK 17 or newer.

From the repository root:

```bash
mkdir -p out
javac -d out src/*.java
java -cp out CreativeAquarium
```

Keep the image and GIF assets in the repository root when running the program;
the current source loads them using relative paths.

## Project structure

```text
src/CreativeAquarium.java  Application entry point and scene setup
src/Panel.java             Custom scene rendering
src/Animator.java          Timer-driven animation updates
src/Item.java              Shared base for scene elements
src/*.java                 Characters, buildings, coral, and submarine
*.png, *.gif               Runtime visual assets
```

## Known limitations

- The window starts maximized and has no in-app controls.
- Asset paths depend on launching the application from the repository root.
- Rendering and animation are coupled to the Swing UI loop.
- There are no automated tests or build-tool configuration yet.

## License and asset notice

The Java source is licensed under the repository's MIT License. SpongeBob
SquarePants characters and related artwork are the property of their respective
rights holders. The included images are used for an educational project and are
not claimed as original artwork or covered by the MIT license. Their provenance
and redistribution rights should be reviewed before reusing or distributing the
project commercially.
