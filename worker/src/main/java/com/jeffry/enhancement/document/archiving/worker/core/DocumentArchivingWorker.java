package com.jeffry.enhancement.document.archiving.worker.core;

import java.nio.file.Path;

/**
 * @author ddwrj
 */
public interface DocumentArchivingWorker {

    void scanPath(Path sourcePath);
}
