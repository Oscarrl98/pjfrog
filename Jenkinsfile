pipeline{
	agent any 
	stages{
		stage('Uploading library'){
				environment {
					MAVEN_HOME = '/usr/share/maven'
				}
			steps{
					echo 'STARTING DEPLOYING'
				
				rtMavenDeployer (
					id: 'ISP2_P',
					serverId: 'artifactory',
					releaseRepo: 'ISP2',
					snapshotRepo: 'ISP2',
				)
				rtMavenRun (
					pom: 'pom.xml',
					goals: 'install',
					deployerId: 'ISP2'
				)
					echo 'FINING DEPLOYING'
				
			
			}
		}
		stage ('documenting builder artefactory info') {
            steps {
                rtPublishBuildInfo (
                    serverId: "artifactory"
                )
            }
        }
	}
}
