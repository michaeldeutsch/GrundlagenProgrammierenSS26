#!/bin/bash
# Update README.md with entries for staged Java files. Intended to be run from .git/hooks/pre-commit.
# It will append/update a short section listing modified Java files and a generic run example.

set -e

staged_files=$(git diff --cached --name-only --diff-filter=AM | grep '\.java$' || true)
[ -z "$staged_files" ] && exit 0

tmpfile=$(mktemp)
cp README.md "$tmpfile"

# Append automation header
cat >> "$tmpfile" <<'EOF'

---

## Automatisch aktualisierte Beispiele (letzte Änderungen)
Diese Sektion wird automatisch vor jedem Commit geupdated und listet geänderte Java-Dateien mit einem Ausführungsbeispiel.
EOF

for f in $staged_files; do
  cat >> "$tmpfile" <<EOF

### Datei: $f
Pfad: $f
Ausführen (nach Kompilierung):

    # Beispiel (nach 'mvn compile' oder IDE-Run):
    java -cp target/classes <fully.qualified.MainClass>

Hinweis: Ersetze <fully.qualified.MainClass> durch den vollqualifizierten Klassennamen (z.B. zt2.Codierung).
EOF
done

mv "$tmpfile" README.md

git add README.md

exit 0
