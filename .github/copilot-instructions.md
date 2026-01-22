# Copilot / AI Agent Instructions for dsa-java

This repository is a small collection of standalone Java algorithm examples (no Maven/Gradle). Each `.java` typically contains a `main` for manual testing. Keep edits minimal and focused: these are practice problems, not a packaged app.

Key places to inspect
- Root: many single-file solutions (e.g. `TwoSum.java`, `ThreeSum.java`, `MajorityElement.java`).
- [array](array): collection of array-focused examples (e.g. `LinearSearch.java`, `MinMax.java`).
- [Basic_java](Basic_java): assorted examples and utilities (e.g. `PRIME_Num.java`).

Big-picture notes
- No build system: files are in the default package. Do not introduce packages or change file-level package declarations unless you provide a plan to migrate the whole repo to a build system.
- Each file is independently runnable via `javac`/`java`. Many files read from `System.in` and expect interactive or piped input.
- Aim for non-breaking, minimal edits: prefer refactors inside a single file and preserve the ability to compile/run with simple `javac` commands.

Developer workflows (commands)
- Compile all Java sources (cross-platform guidance):

```bash
# Unix / Git Bash
javac -d out $(find . -name "*.java")

# Windows PowerShell
Get-ChildItem -Recurse -Filter *.java | ForEach-Object { $_.FullName } | %{ javac -d out $_ }
```

- Run a single example (default package):

```bash
# after compiling to out/, run the main class by simple name
java -cp out PRIME_Num
# Example: to run the prime checker in Basic_java/PRIME_Num.java
```

Repo-specific conventions and patterns
- Files live in the default package (no `package` line). Avoid adding packages to individual files.
- Many classes use `Scanner`/`System.in` and print simple results like `Prime`/`Not Prime` — keep I/O behavior stable unless explicitly updating tests.
- Naming is inconsistent (e.g. `ArrayaList.java`, `PRIME_Num.java`). Do not rename files without updating all references (and inform the user). Prefer small, localized fixes.

When editing
- If adding new utilities used by multiple files, prefer adding them under a new `util/` folder and keep them in the default package, then update compile instructions.
- For multi-file changes (e.g., introducing a package or build tool), propose a migration plan first. Large cross-file refactors require follow-up: convert all files to packages and add a `build.gradle` or `pom.xml`.
- Keep output strings unchanged unless fixing incorrect behavior — many judges/tests rely on exact strings.

Testing guidance
- There are no automated tests. Validate changes by compiling and running the modified class.
- Example run for `PRIME_Num`:

```bash
# Compile the single file
javac Basic_java/PRIME_Num.java
# Run and give input
echo 17 | java -cp Basic_java PRIME_Num
```

Integration points & dependencies
- There are no external libraries or network dependencies in the repo. All code uses JDK classes only.

Goals for AI edits
- Prefer clarity and correctness: improve algorithm readability and complexity comments where helpful.
- Avoid sweeping renames or packaging changes without a migration plan.
- Preserve existing I/O formats and single-file runnable behavior.

If anything is unclear or you want me to adopt a different approach (e.g., migrate to Gradle, add unit tests, or normalize naming), tell me which direction and I will draft a plan and apply it.
