package mvc

// EXTERNAL https://github.com/cavneb/FileUploader

import org.springframework.web.multipart.MultipartFile
import grails.web.context.ServletContextHolder
import java.util.UUID

class FileUploadService {

    boolean transactional = true

    def String uploadFile(MultipartFile file, String name, String destinationDirectory) {

        def servletContext = ServletContextHolder.servletContext
        //def storagePath = servletContext.getRealPath(destinationDirectory)
        def storagePath = 'C:/Users/Urs/Documents/GitHub/hs17-bewertete-uebung-neoplay/grails-app/assets/'+destinationDirectory

        // Create storage path directory if it does not exist
        def storagePathDirectory = new File(storagePath)
        if (!storagePathDirectory.exists()) {
            print "CREATING DIRECTORY ${storagePath}: "
            if (storagePathDirectory.mkdirs()) {
                println "SUCCESS"
            } else {
                println "FAILED"
            }
        }

        // Store file
        if (!file.isEmpty()) {
            file.transferTo(new File("${storagePath}/${name}"))
            println "Saved file: ${storagePath}/${name}"
            return "${name}"

        } else {
            println "File ${file.inspect()} was empty!"
            return null
        }
    }
}