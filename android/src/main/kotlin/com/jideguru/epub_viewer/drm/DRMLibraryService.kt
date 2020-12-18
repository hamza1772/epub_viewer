/*
 * Module: r2-testapp-kotlin
 * Developers: Aferdita Muriqi
 *
 * Copyright (c) 2019. European Digital Reading Lab. All rights reserved.
 * Licensed to the Readium Foundation under one or more contributor license agreements.
 * Use of this source code is governed by a BSD-style license which is detailed in the
 * LICENSE file present in the project repository where this source code is maintained.
 */

package com.jideguru.epub_viewer.drm

import org.readium.r2.shared.util.Try
import java.io.File


data class DRMFulfilledPublication(
    val localFile: File,
    val suggestedFilename: String
)

interface DRMLibraryService {
    suspend fun fulfill(file: File): Try<DRMFulfilledPublication, Exception>
}