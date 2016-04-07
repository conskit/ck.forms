(defproject ck.forms "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [conskit "0.1.0-SNAPSHOT"]]
  :profiles {:dev {:source-paths ["dev"]
                   :dependencies [[puppetlabs/trapperkeeper "1.3.0" :classifier "test"]
                                  [puppetlabs/kitchensink "1.3.0" :classifier "test" :scope "test"]
                                  [midje "1.8.3"]]
                   :plugins [[lein-midje "3.2"]]}})
