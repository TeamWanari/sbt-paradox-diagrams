## Release to Maven Central

### Requirements

You created the JIRA and Nexus user and the ticket for your group id
as explained in https://central.sonatype.org/pages/ossrh-guide.html

Add the credentials for the Sonatype plugin:

```
$HOME/.sbt/(sbt-version 0.13 or 1.0)/sonatype.sbt
```

should contain

```
credentials += Credentials("Sonatype Nexus Repository Manager",
        "oss.sonatype.org",
        "(Sonatype user name)",
        "(Sonatype password)")
```

Make sure you pushed everything to the remote before releasing.

### Run
Execute

    sbt "release"

Which will:
 1. Compare the local git status with the remote (should be same)
 1. Compile
 1. Test
 1. Publish to Central
 1. Close the release in the Sonatype OSS Nexus
 1. Create a git tag
 1. Bump up the version with a commit
 1. Push the new master to the remote

The release might enter a loop under certain circumstances (in cross-release at least). Just exist after the push.

Update Docs
===========

```
git checkout v<released_version>
sbt ghpagesPushSite
```

