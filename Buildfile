repositories.remote << 'http://repo1.maven.org/maven2'

JUNIT = 'junit:junit:jar:4.8.2'
HAMCREST = 'org.hamcrest:hamcrest-all:jar:1.1'
COMMONS_LANG = 'org.apache.commons:commons-lang3:jar:3.1'

define 'subzero' do
  project.version = '0.1.0'
  package :jar
  compile.with COMMONS_LANG
  test.with JUNIT, HAMCREST
end

